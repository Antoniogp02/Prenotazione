package com.app.prenotazione.controller;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.service.HabitacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HabitacionesController {

    @Autowired
    private HabitacionesService habitacionesService;

    @RequestMapping("/habitaciones")
    public List<Habitaciones> obtenerHabitaciones(){
        return habitacionesService.obtenerHabitaciones();
    }

}
