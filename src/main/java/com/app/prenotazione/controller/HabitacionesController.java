package com.app.prenotazione.controller;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.service.HabitacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HabitacionesController {

    @Autowired
    private HabitacionesService habitacionesService;

    @RequestMapping("/habitaciones")
    public List<Habitaciones> obtenerHabitaciones(){
        return habitacionesService.getAll();
    }

    @GetMapping("/listar")
    public List<Habitaciones> listarHabiatciones(){
        return  habitacionesService.listar();
    }

    @GetMapping("/habitaciones/nuevo")
    public ModelAndView nuevaHabitacion(){
        ModelAndView model = new ModelAndView("nuevaHabitacion");
        Habitaciones habitaciones = new Habitaciones();
        model.addObject("habitaciones", habitaciones);
        return model;
    }


    @GetMapping("/buscar")
    public Habitaciones getById(@RequestParam Integer id){
        return  habitacionesService.buscarPorID(id);
    }


    @PostMapping("/guardar")
    public String guardarHabitaciones(@RequestBody Habitaciones habitaciones){
        habitacionesService.guardar(habitaciones);
        return "Habitación guardada correctamente";
    }






}
