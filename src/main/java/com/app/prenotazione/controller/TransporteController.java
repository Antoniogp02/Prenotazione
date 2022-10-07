package com.app.prenotazione.controller;


import com.app.prenotazione.model.Transporte;
import com.app.prenotazione.service.TransporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransporteController {

    @Autowired
    private TransporteService transporteService;

    @RequestMapping("/transportes")
    public List<Transporte> obtenerTransportes(){
        return transporteService.obtenerTransportes();
    }

}
