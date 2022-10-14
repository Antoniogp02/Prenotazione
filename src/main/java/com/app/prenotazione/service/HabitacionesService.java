package com.app.prenotazione.service;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.repository.HabitacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionesService {

    @Autowired
    private HabitacionesRepository habitacionesRepository;

    @Autowired
    public List<Habitaciones> getAll(){
        return habitacionesRepository.findAll();
    }

    public List<Habitaciones> obtenerHabitaciones(){
        return habitacionesRepository.findAll();
    }

    public List<Habitaciones> listar(){
        return habitacionesRepository.findAll();
    }

    public Habitaciones buscarPorID(Integer id){
        return habitacionesRepository.findById(id).orElse(null);
    }

    public void guardar(Habitaciones habitaciones){
        habitacionesRepository.save(habitaciones);
    }

    public void eliminar(Integer id){
        habitacionesRepository.deleteById(id);
    }

}
