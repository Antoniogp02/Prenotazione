package com.app.prenotazione.controller;

import com.app.prenotazione.model.Buscar;
import com.app.prenotazione.model.Disponibilidad;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.service.BuscarService;
import com.app.prenotazione.service.DisponibilidadService;
import com.app.prenotazione.service.HotelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller
public class InicioController {


    @RequestMapping("/inicio")
    public String cargarInicio(){
        return "inicio";
    }
}

    @Autowired
    private HotelesService hotelesService;

    @Autowired
    private BuscarService buscarService;

    @GetMapping
    public ModelAndView listaHoteles(@ModelAttribute Buscar buscar){
        List<Hoteles> primerlistado = hotelesService.getAll();
        Collections.shuffle(primerlistado);
        
    }


}
>>>>>>> master
