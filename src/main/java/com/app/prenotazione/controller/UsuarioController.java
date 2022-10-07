package com.app.prenotazione.controller;


import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @RequestMapping("/usuarios")
    public List<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
}
