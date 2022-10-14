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

    public guardarHotel(Hoteles hoteles) {

    }

    public List<Hoteles> getAll(){
        return hotelesRepository.findAll();
    }

    public Hoteles getById(int id){
        return hotelesRepository.findById(id).orElse(null);
    }

}
