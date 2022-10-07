package com.app.prenotazione.controller;

import com.app.prenotazione.model.Disponibilidad;
import com.app.prenotazione.service.DisponibilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisponibilidadController {

    @Autowired
    private DisponibilidadService disponibilidadService;

    @RequestMapping("/disponibilidad")
    public List<Disponibilidad> obtenerDisponibilidad(){
        return disponibilidadService.obtenerDisponibilidad();
    }

}
