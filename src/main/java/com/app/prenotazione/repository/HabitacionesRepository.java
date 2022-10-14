package com.app.prenotazione.repository;

import com.app.prenotazione.model.Habitaciones;
import com.app.prenotazione.model.Hoteles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitacionesRepository extends JpaRepository<Habitaciones, Integer>{

    @Query(value = "select h1 from Habitaciones h1 order by h1.num_habitacion ")
    List<Hoteles> obtenerHoteles();
}
