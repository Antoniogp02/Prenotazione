package com.app.prenotazione.repository;


import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

    @Query(value = "select r from Reserva r order by r.num_reserva ")
    List<Hoteles> obtenerHoteles();
}
