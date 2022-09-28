package com.app.prenotazione.repository;

import com.app.prenotazione.model.Habitaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionesRepository extends JpaRepository<Habitaciones, Integer>{
}
