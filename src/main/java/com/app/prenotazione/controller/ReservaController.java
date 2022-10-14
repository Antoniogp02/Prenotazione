package com.app.prenotazione.controller;

import com.app.prenotazione.model.Reserva;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @RequestMapping("/reservas")
    public List<Reserva> obtenerReservas(){
        return reservaService.obtenerReservas();
    }

    @PostMapping("/reservas/guardar")
    public void guardarReserva( @RequestBody @ModelAttribute("reervas") Reserva reserva){
        reservaService.guardarReserva(reserva);
    }

}
