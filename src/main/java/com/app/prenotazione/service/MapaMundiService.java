package com.app.prenotazione.service;

import com.app.prenotazione.model.MapaMundi;
import com.app.prenotazione.repository.MapaMundiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapaMundiService {

    @Autowired
    private MapaMundiRepository mapaMundiRepository;


    public List<MapaMundi> obternerOrdenadasPorID(){
        return mapaMundiRepository.obtenerMapamundi();
    }

    public MapaMundi getById(int id){
        return mapaMundiRepository.findById(id).orElse(null);
    }

    public List<MapaMundi> getAll(){
        return mapaMundiRepository.findAll();
    }

}
