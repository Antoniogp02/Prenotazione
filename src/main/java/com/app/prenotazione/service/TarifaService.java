package com.app.prenotazione.service;


import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Servicios;
import com.app.prenotazione.model.Tarifa;
import com.app.prenotazione.repository.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarifaService {

    @Autowired
    private TarifaRepository tarifaRepository;

    public List<Tarifa> obternerOrdenadasPorID(){
        return tarifaRepository.obtenerTarifa();
    }

    public Tarifa getById(int id){
        return tarifaRepository.findById(id).orElse(null);
    }

    public void guardarTarifa(int id, Habitaciones habitaciones, Float cantidad, String temporada ){
        Tarifa tarifaGuardar = new Tarifa();
        if(id!= 0){
            Tarifa t = tarifaRepository.findById(id).orElse(null);
            if(t!=null){
                tarifaGuardar = t;
            }
        }
        tarifaGuardar.setId(id);
        tarifaGuardar.setId_habitaciones(Integer.parseInt(""));
        tarifaGuardar.setCantidad(cantidad);
        tarifaGuardar.setTemporada(temporada);
    }

    public void guardarTarifa(Tarifa tarifa){
        tarifaRepository.save(tarifa);
    }

    public void eliminar(Integer id){
        tarifaRepository.deleteById(id);
    }

}
