package com.app.prenotazione.service;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.MapaMundi;
import com.app.prenotazione.model.Servicios;
import com.app.prenotazione.repository.HotelesRepository;
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

}
