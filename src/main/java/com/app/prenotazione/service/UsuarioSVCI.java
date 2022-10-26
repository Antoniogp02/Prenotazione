package com.app.prenotazione.service;

import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.repository.UsuarioRIP;
import com.app.prenotazione.repository.UsuarioSVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usuarioSVC")
public class UsuarioSVCI implements UsuarioSVC {

    @Qualifier("usuarioRIP")
    @Autowired
    private UsuarioRIP usuarioRIP;

    @Override
    public List<Usuario> listAllUsuario() {
        return usuarioRIP.findAll();
    }

    @Override
    public Usuario addUsuario(Usuario usuario) {
        return usuarioRIP.save(usuario);
    }
}
