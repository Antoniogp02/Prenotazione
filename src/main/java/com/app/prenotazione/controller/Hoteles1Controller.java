package com.app.prenotazione.controller;

import com.app.prenotazione.service.Hoteles1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class Hoteles1Controller {

    @Autowired
    @Qualifier("Hoteles1service")
    private Hoteles1Service hoteles1Service;

    @GetMapping("/list")
    public ModelAndView listAllHoteles(){
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("hoteles", hoteles1Service.listAllHoteles());
        return mav;
    }

}
