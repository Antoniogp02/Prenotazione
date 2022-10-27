package com.app.prenotazione.controller;

import com.app.prenotazione.model.HotelForm;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.UserForm;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.repository.HotelesSVC;
import com.app.prenotazione.repository.UsuarioSVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.Boolean.parseBoolean;

@Controller
@RequestMapping("/hoteles")
public class HotelesCTRL {

    @Autowired
    @Qualifier("hotelesSVC")
    private HotelesSVC hotelesSVC;

    @GetMapping("/listHotel")
    public ModelAndView listAllHoteles() {
        ModelAndView mav = new ModelAndView("listHotel");
        mav.addObject("hoteles",hotelesSVC.listAllHoteles());
        mav.addObject("hotel", new Hoteles());
        return mav ;
    }

    @PostMapping("/addhoteles")
    public String addHoteles(@RequestBody @ModelAttribute(name = "hotel") HotelForm hotelForm){


        Hoteles hotel = new Hoteles();
        hotel.setNombre(hotelForm.getNombre());
        hotel.setLocalizacion(hotelForm.getLocalizacion());
        hotel.setCorreo(hotelForm.getCorreo());
        hotel.setTelefono(hotelForm.getTelefono());
        hotel.setHabitaciones(hotelForm.getHabitaciones());
        hotelesSVC.addHoteles(hotel);
        return "redirect:/listHoteles";
    }


}
