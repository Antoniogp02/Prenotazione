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

    public List<Hoteles> getAll(){


    public List<Hoteles> getAll(){
        return hotelesRepository.findAll();
    }

    public Hoteles getById(int id){
        return hotelesRepository.findById(id).orElse(null);
    }

    public Hoteles getById(int id){
        return hotelesRepository.findById(id).orElse(null);
    }

    public void guardarHotel(int id, String nombre, String correo , String localizacion, Integer telefono, Habitaciones habitaciones, Servicios servicios){
        Hoteles hotelesGuardar = new Hoteles();
        if(id!= 0){
            Hoteles h = hotelesRepository.findById(id).orElse(null);
            if(h!=null){
                hotelesGuardar = h;
            }
        }
        hotelesGuardar.setNombre(nombre);
        hotelesGuardar.setCorreo(correo);
        hotelesGuardar.setLocalizacion(localizacion);
        hotelesGuardar.setTelefono(telefono);
        hotelesGuardar.setHabitaciones(habitaciones);
        hotelesGuardar.setServicios(servicios);
    }

    public void guardarHotel(Hoteles hoteles){
        hotelesRepository.save(hoteles);
    }

    public void eliminar(Integer id){
        hotelesRepository.deleteById(id);
    }

}
