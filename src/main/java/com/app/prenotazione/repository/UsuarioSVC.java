package com.app.prenotazione.repository;

import com.app.prenotazione.model.Usuario;

import java.util.List;

public interface UsuarioSVC {

    public abstract List<Usuario> listAllUsuario();

    public abstract Usuario addUsuario(Usuario usuario);

}
