package com.app.prenotazione.controller;

import com.app.prenotazione.model.UserForm;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.repository.UsuarioSVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.Boolean.parseBoolean;

@Controller
@RequestMapping("/user")
public class UsuarioCTRL {

    @Autowired
    @Qualifier("usuarioSVC")
    private UsuarioSVC usuarioSVC;

    @GetMapping("/list")
    public ModelAndView listAllUsuarios() {
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("usuarios",usuarioSVC.listAllUsuario());
        mav.addObject("user", new Usuario());
        return mav ;
    }

    @PostMapping("/addusers")
    public String addUsers(@RequestBody @ModelAttribute(name = "user") UserForm userForm){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        LocalDate fecha = LocalDate.parse(userForm.getFecha_nacimiento(), formatter);

        Usuario usuario = new Usuario();
        usuario.setNombre(userForm.getNombre());
        usuario.setApellidos(userForm.getApellidos());
        usuario.setCorreo(userForm.getCorreo());
        usuario.setDni(userForm.getDni());
        usuario.setTelefono(userForm.getTelefono());
        usuario.setGenero(userForm.getGenero());
        usuario.setFecha_nacimiento(fecha);
        usuarioSVC.addUsuario(usuario);
        return "redirect:/list";
    }


}
