package com.app.prenotazione.controller;


import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.service.HotelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelesController {

    @Autowired
    private HotelesService hotelesService;

    @RequestMapping("/hoteles")
    public List<Hoteles> obtenerHoteles(){
        return hotelesService.obtenerHoteles();
    }

}
