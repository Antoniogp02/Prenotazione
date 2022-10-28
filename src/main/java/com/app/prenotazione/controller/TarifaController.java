/*package com.app.prenotazione.controller;

import com.app.prenotazione.model.*;
import com.app.prenotazione.repository.HabitacionesSVC;
import com.app.prenotazione.service.HabitacionesService;
import com.app.prenotazione.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class TarifaController {

    @Autowired
    private TarifaService tarifaService;

    @Autowired
    private HabitacionesSVC habitacionesSVC;

    @RequestMapping("/tarifas")
    public List<Tarifa> obtenerTarifas() {
        return tarifaService.obternerOrdenadasPorID();
    }

    @GetMapping("/tarifas/nueva")
    public ModelAndView nuevaReserva() {
        ModelAndView model = new ModelAndView("nuevaTarifaReserva");
        Tarifa tarifa = new Tarifa();
        List<Habitaciones> habitaciones = habitacionesService.getAll();
        model.addObject("tarifa", tarifa);
        model.addObject("listaHabitaciones", habitaciones);
        return model;
    }

    @PostMapping("/tarifas/guardar")
    public void guardarTarifa(@RequestBody @ModelAttribute("tarifas") Tarifa tarifa) {
        tarifaService.guardarTarifa(tarifa);

    }



    @DeleteMapping("/tarifas/eliminar")
    public String eliminar(@RequestBody Integer id){
        tarifaService.eliminar(id);
        return "Tarifa eliminada correctamente";
    }

}

 */
