package com.app.prenotazione.repository;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Usuario;

import java.util.List;

public interface HabitacionesSVC {

    public abstract List<Habitaciones> listAllHabitaciones();

    public abstract Habitaciones addHabitaciones(Habitaciones habitaciones);

}
