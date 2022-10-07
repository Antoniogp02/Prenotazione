package com.app.prenotazione.service;


import com.app.prenotazione.model.Tarifa;
import com.app.prenotazione.repository.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarifaService {

    @Autowired
    private TarifaRepository tarifaRepository;

    public List<Tarifa> obtenerTarifas(){
        return tarifaRepository.findAll();
    }

}
