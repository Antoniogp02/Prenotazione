package com.app.prenotazione.repository;


import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Integer> {

    @Query(value = "select t from Tarifa t order by t.id ")
    List<Tarifa> obtenerTarifa();

}
