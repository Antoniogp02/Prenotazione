package com.app.prenotazione.repository;


import com.app.prenotazione.model.Hoteles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelesRepository extends JpaRepository<Hoteles,Integer>{

    @Query(value = "select h from Hoteles h order by h.nombre ")
    List<Hoteles> obtenerHoteles();
}
