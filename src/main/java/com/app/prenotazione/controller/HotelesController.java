package com.app.prenotazione.controller;


import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.service.HabitacionesService;
import com.app.prenotazione.service.HotelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@RestController
public class HotelesController {

    @Autowired
    private HotelesService hotelesService;

    @Autowired
    private HabitacionesService habitacionesService;


    @RequestMapping("/hoteles")
    public List<Hoteles> obtenerHoteles() {
        return hotelesService.getAll();
    }

    @RequestMapping("/ListHoteles")
    public ModelAndView pantallaHoteles() {
        List<Hoteles> listHoteles = hotelesService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ListHoteles", listHoteles);
        return modelAndView;

    }
        @GetMapping("/hoteles/nuevo")
        public ModelAndView nuevoHotel() {
            ModelAndView model = new ModelAndView("nuevoHotel");
            Hoteles hoteles = new Hoteles();
            List<Habitaciones> habitaciones = habitacionesService.getAll();
            model.addObject("listahabitaciones", habitaciones);
            model.addObject("hoteles", hoteles);
            return model;
        }


        @PostMapping("/hoteles/guardar")
        public void guardarHotel(@RequestBody @ModelAttribute("hoteles") Hoteles hoteles){
            hotelesService.guardarHotel(hoteles);
        }

        @DeleteMapping("/hoteles/eliminar")
        public String eliminar(@RequestBody Integer id){
            hotelesService.eliminar(id);
            return "Hotel eliminado correctamente";
        }

    }


