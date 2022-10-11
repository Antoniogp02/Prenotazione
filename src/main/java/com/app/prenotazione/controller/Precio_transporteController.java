package com.app.prenotazione.controller;

import com.app.prenotazione.model.PrecioTransporte;
import com.app.prenotazione.service.Precio_transporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Precio_transporteController {

    @Autowired
    private Precio_transporteService precio_transporteService;

    @RequestMapping("/precio_transportes")
    public List<PrecioTransporte> obtenerPrecio_transportes(){
        return precio_transporteService.obtenerPrecio_transportes();
    }

}
