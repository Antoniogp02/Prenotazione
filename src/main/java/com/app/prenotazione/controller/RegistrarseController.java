package com.app.prenotazione.controller;

import com.app.prenotazione.model.Login;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.service.LoginService;
import com.app.prenotazione.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/login")
public class RegistrarseController {
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private LoginService loginService;

    @GetMapping("/registrarse")
    public ModelAndView submitForm(@ModelAttribute Usuario usuario, Login login){
        ModelAndView modelo = new ModelAndView("session");
        modelo.addObject("usuario", usuario);
        modelo.addObject("login", login);
        return modelo;
    }

    @PostMapping("/save")
    public String guardarUsuario(@RequestBody Usuario usuario, Login login){
        usuarioService.guardarUsuario(usuario);
        loginService.registrarLogin(login);
        return("Datos guardados de forma correcta");
    }

}
