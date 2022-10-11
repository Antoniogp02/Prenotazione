package com.app.prenotazione.controller;


import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.service.HotelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@RestController
public class HotelesController {

    @Autowired
    private HotelesService hotelesService;

    @RequestMapping("/hoteles")
    public List<Hoteles> obtenerHoteles(){
        return hotelesService.obtenerHoteles();
    }

    @RequestMapping("/ListHoteles")
    public ModelAndView pantallaHoteles(){
    List<Hoteles> listHoteles = hotelesService.obtenerHoteles();
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("ListHoteles", listHoteles);
    return modelAndView;
    }

}
