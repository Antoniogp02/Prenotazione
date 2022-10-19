package com.app.prenotazione.controller;

import com.app.prenotazione.model.Buscar;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.repository.HotelesRepository;
import com.app.prenotazione.service.BuscarService;
import com.app.prenotazione.service.HotelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@Controller
public class InicioController {
    @Autowired
    private HotelesService hotelesService;
    @Autowired
    private BuscarService buscarService;

    @GetMapping
    public ModelAndView hotellista(@ModelAttribute Buscar buscar){
        List<Hoteles> primeralista = hotelesService.getAll();
        Collections.shuffle(primeralista);
        List<Hoteles> listHoteles = primeralista.subList(0,3);
        ModelAndView modelo= new ModelAndView("inicio");
        modelo.addObject("listHotel", listHoteles);
        modelo.addObject("fechaminima", LocalDate.now());
        modelo.addObject("buscar", buscar);
        return modelo;
    }

    @PostMapping("/inicio")
    public ModelAndView hoteleslista(@ModelAttribute Buscar buscar){
        List<Hoteles> hoteleslista = hotelesService.getAll();
        ModelAndView modelo = new ModelAndView("resultados");
        List<Hoteles> filtrado = buscarService.BotonBuscar(buscar, hoteleslista);
        if(LocalDate.parse(buscar.getFechaEntrada()).isAfter(LocalDate.parse(buscar.getFechaSalida()))){
            return new ModelAndView("redirect:main");
        }
        modelo.addObject("fechaminima", LocalDate.now());
        modelo.addObject("filtrado", filtrado);
        return modelo;
    }

    @GetMapping("/")
    public String volverAinicio (@ModelAttribute Buscar buscar){
        return "inicio";
    }

}


