package com.app.prenotazione.service;


import com.app.prenotazione.model.Precio_transporte;
import com.app.prenotazione.repository.Precio_transporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Precio_transporteService {

    @Autowired
    private Precio_transporteRepository Precio_transporteRepository;

    public List<PrecioTransporte> obtenerPrecio_transportes(){
        return precio_transporteRepository.findAll();
    }

}
