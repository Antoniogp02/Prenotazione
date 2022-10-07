package com.app.prenotazione.service;

import com.app.prenotazione.model.Reserva;
import com.app.prenotazione.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> obtenerReservas(){
        return reservaRepository.findAll();
    }

}
