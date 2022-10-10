package com.app.prenotazione.controller;


import com.app.prenotazione.model.Servicios;
import com.app.prenotazione.service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServicioController {

    @Autowired
    private ServiciosService serviciosService;

    @RequestMapping("/servicios")
    public List<Servicios> obtenerServicios(){
        return serviciosService.obtenerServicios();
    }

    

}
