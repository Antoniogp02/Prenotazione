package com.app.prenotazione.controller;


import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @RequestMapping("/usuarios")
    public List<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping("/usuarios/guardar")
    public void guardarUsuario( @RequestBody @ModelAttribute("usuarios") Usuario usuario){
        usuarioService.guardarUsuario(usuario);
    }

}
