package com.app.prenotazione.service;

import com.app.prenotazione.model.Buscar;
import com.app.prenotazione.model.Hoteles;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuscarService{
        public List<Hoteles> BotonBuscar(Buscar buscar, List<Hoteles> listaHoteles){
            String srtBuscar;
            List<Hoteles> coincidan = new ArrayList<>();
            srtBuscar = buscar.getHotelBuscar().toLowerCase();
            for(Hoteles hoteles : listaHoteles) {
                if ((hoteles.getLocalizacion().toLowerCase().contains(srtBuscar)) ||
                        (hoteles.getNombre().toLowerCase().contains(srtBuscar))) {
                    coincidan.add(hoteles);
                }
            }
            return coincidan;
        }
    }

