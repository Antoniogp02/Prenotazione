package com.app.prenotazione.service;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("habitacionesSVC")
public class HabitacionesSVCI implements HabitacionesSVC {

    @Qualifier("habitacionesRIP")
    @Autowired
    private HabitacionesRIP habitacionesRIP;

    @Override
    public List<Habitaciones> listAllHabitaciones() {
        return habitacionesRIP.findAll();
    }

    @Override
    public Habitaciones addHabitaciones(Habitaciones habitaciones) {
        return habitacionesRIP.save(habitaciones);
    }
}
