package com.app.prenotazione.controller;


import com.app.prenotazione.model.Enumerados.Roles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
public class InicioController {

    @RequestMapping("/inicio")
    public String cargarInicio(){
        return "inicio";
    }


}


