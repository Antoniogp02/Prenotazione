package com.app.prenotazione.controller;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.HabitacionesForm;
import com.app.prenotazione.repository.HabitacionesSVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Controller
@RequestMapping("/habitaciones")
public class HabitacionesCTRL {

    @Autowired
    @Qualifier("habitacionesSVC")
    private HabitacionesSVC habitacionesSVC;

    @GetMapping("/listHabitaciones")
    public ModelAndView listAllHabitaciones() {
        ModelAndView mav = new ModelAndView("listHabitaciones");
        mav.addObject("habitaciones",habitacionesSVC.listAllHabitaciones());
        mav.addObject("habitacion", new Habitaciones());
        return mav ;
    }

    @PostMapping("/addhabitaciones")
    public String addHabitaciones(@RequestBody @ModelAttribute(name = "habitacion") HabitacionesForm habitacionesForm){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        LocalDate fecha = LocalDate.parse(habitacionesForm.getFecha_salida(), formatter);
        LocalDate fecha1 = LocalDate.parse(habitacionesForm.getFecha_entrada(), formatter);

        Habitaciones habitaciones = new Habitaciones();
        habitaciones.setNum_habitacion(habitacionesForm.getNum_habitacion());
        habitaciones.setNum_personas(habitacionesForm.getNum_personas());
        habitaciones.setPrecio(Double.valueOf(habitacionesForm.getPrecio()));
        habitaciones.setFecha_entrada(fecha1);
        habitaciones.setFecha_salida(fecha);
        habitaciones.setHoteles(habitacionesForm.getHoteles());
        habitacionesSVC.addHabitaciones(habitaciones);
        return "redirect:/listHabitaciones";
    }


}
