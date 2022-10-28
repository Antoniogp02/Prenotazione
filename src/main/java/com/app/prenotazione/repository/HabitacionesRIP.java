package com.app.prenotazione.repository;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository("habitacionesRIP")
public interface HabitacionesRIP extends JpaRepository<Habitaciones, Serializable> {
}
