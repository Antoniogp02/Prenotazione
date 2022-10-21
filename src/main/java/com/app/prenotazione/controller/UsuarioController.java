package com.app.prenotazione.controller;


import com.app.prenotazione.model.*;
import com.app.prenotazione.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @RequestMapping("/usuarios")
    public List<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/usuarios/nuevo")
    public ModelAndView nuevaUsuario(){
        ModelAndView model = new ModelAndView("nuevoUsuario");
        Usuario usuario = new Usuario();
        model.addObject("usuario", usuario);
        return model;
    }


    @PostMapping("/usuarios/guardar")
    public void guardarUsuario( @RequestBody @ModelAttribute("usuarios") Usuario usuario){
        usuarioService.guardarUsuario(usuario);
    }


    @DeleteMapping("/usuarios/eliminar")
    public String eliminar(@RequestBody Integer id){
        usuarioService.eliminar(id);
        return "Usuario eliminado correctamente";
    }

}
