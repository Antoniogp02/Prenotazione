package com.app.prenotazione.controller;

import com.app.prenotazione.model.UserForm;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.repository.UsuarioSVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
        Usuario usuario = new Usuario();
        usuario.setNombre(userForm.getNombre());
        usuario.setApellidos(userForm.getApellidos());
        usuario.setCorreo(userForm.getCorreo());
        usuario.setDni(userForm.getDni());
        usuarioSVC.addUsuario(usuario);
        return "redirect:user/list";
    }


}
