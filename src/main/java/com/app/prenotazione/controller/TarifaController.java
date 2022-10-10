package com.app.prenotazione.controller;

import com.app.prenotazione.model.Tarifa;
import com.app.prenotazione.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TarifaController {

    @Autowired
    private TarifaService tarifaService;

    @RequestMapping("/tarifas")
    public List<Tarifa> obtenerTarifas(){
        return tarifaService.obtenerTarifas();
    }

}
