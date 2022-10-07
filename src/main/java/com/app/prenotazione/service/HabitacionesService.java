package com.app.prenotazione.service;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.repository.HabitacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionesService {

    @Autowired
    private HabitacionesRepository habitacionesRepository;

    public List<Habitaciones> obtenerHabitaciones(){
        return habitacionesRepository.findAll();
    }

}
