package com.app.prenotazione.service;

import com.app.prenotazione.model.*;
import com.app.prenotazione.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> obtenerReservas(){
        return reservaRepository.findAll();
    }

    public void guardarReserva(int id, Integer num_reserva, Float precio_total , Date fecha_entrada,Date fecha_salida, String lugar_destino, Integer num_habitaciones, Usuario usuario, Hoteles hoteles, Transporte transporte, MapaMundi mapaMundi){
        Reserva reservasGuardar = new Reserva();
        if(id!= 0){
            Reserva r = reservaRepository.findById(id).orElse(null);
            if(r!=null){
                reservasGuardar = r;
            }
        }
        reservasGuardar.setId(id);
        reservasGuardar.setNum_reserva(num_reserva);
        reservasGuardar.setPrecio_total(precio_total);
        reservasGuardar.setFecha_entrada(fecha_entrada);
        reservasGuardar.setFecha_salida(fecha_salida);
        reservasGuardar.setLugar_destino(lugar_destino);
        reservasGuardar.setNum_habitaciones(num_habitaciones);
        reservasGuardar.setId_usuario(Integer.parseInt(""));
        reservasGuardar.setId_hoteles(Integer.parseInt(""));
        reservasGuardar.setId_transporte(Integer.parseInt(""));
    }

    public void guardarReserva(Reserva reserva){
        reservaRepository.save(reserva);
    }

}
