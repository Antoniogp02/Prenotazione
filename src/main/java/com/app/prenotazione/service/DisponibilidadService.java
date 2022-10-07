package com.app.prenotazione.service;

import com.app.prenotazione.model.Disponibilidad;
import com.app.prenotazione.model.Transporte;
import com.app.prenotazione.repository.DisponibilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisponibilidadService {

    @Autowired
    private DisponibilidadRepository disponibilidadRepository;

    public List<Disponibilidad> obtenerDisponibilidad(){
        return disponibilidadRepository.findAll();
    }


}
