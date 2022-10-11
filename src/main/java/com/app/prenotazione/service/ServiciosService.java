package com.app.prenotazione.service;

import com.app.prenotazione.model.Servicios;
import com.app.prenotazione.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosService {


    @Autowired
    private ServiciosRepository serviciosRepository;

    public List<Servicios> obtenerServicios(){
        return serviciosRepository.findAll();
    }

}
