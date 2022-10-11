package com.app.prenotazione.controller;

import com.app.prenotazione.model.Disponibilidad;
import com.app.prenotazione.service.DisponibilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class InicioController {

    @RequestMapping("/")
    public String cargarInicio(){
        return "inicio";
    }
}