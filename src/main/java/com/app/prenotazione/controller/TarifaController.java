package com.app.prenotazione.controller;

import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Tarifa;
import com.app.prenotazione.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TarifaController {

    @Autowired
    private TarifaService tarifaService;

    @RequestMapping("/tarifas")
    public List<Tarifa> obtenerTarifas() {
        return tarifaService.obternerOrdenadasPorID();
    }

    @PostMapping("/tarifas/guardar")
    public void guardarTarifa(@RequestBody @ModelAttribute("tarifas") Tarifa tarifa) {
        tarifaService.guardarTarifa(tarifa);

    }
}
