package com.app.prenotazione.service;


import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Transporte;
import com.app.prenotazione.repository.TransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransporteService {

    @Autowired
    private TransporteRepository transporteRepository;

    public List<Transporte> obtenerTransportes(){
        return transporteRepository.findAll();
    }

    public List<Transporte> getAll(){
        return transporteRepository.findAll();
    }

}
