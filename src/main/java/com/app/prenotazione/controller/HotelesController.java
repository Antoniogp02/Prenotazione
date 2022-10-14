package com.app.prenotazione.controller;


import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.service.HabitacionesService;
import com.app.prenotazione.service.HotelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HotelesController {

    @Autowired
    private HotelesService hotelesService;

    @Autowired
    private HabitacionesService habitacionesService;

    @RequestMapping("/hoteles")
    public List<Hoteles> obtenerHoteles(){
        return hotelesService.getAll();
    }



    @PostMapping("/hoteles/guardar")
    public void guardarHotel( @RequestBody @ModelAttribute("hoteles") Hoteles hoteles){
        hotelesService.guardarHotel(hoteles);
    }

}
