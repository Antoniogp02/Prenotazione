package com.app.prenotazione.service;

import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.repository.HotelesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelesService {

    @Autowired
    private HotelesRepository hotelesRepository;

    public List<Hoteles> obtenerHoteles(){
        return hotelesRepository.findAll();
    }

    public Hoteles getByNombre(String nombre){
        List<Hoteles> hoteles = obtenerHoteles();

        return hotelesRepository.findbynombre(String.valueOf(hoteles));
    }

}
