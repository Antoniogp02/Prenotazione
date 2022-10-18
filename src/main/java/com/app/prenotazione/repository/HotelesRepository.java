package com.app.prenotazione.repository;


import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.service.HotelesService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


@Repository
public interface HotelesRepository extends JpaRepository<Hoteles,Integer>{

    @Query(value = "select h from Hoteles h order by h.nombre ")
    List<Hoteles> obtenerHoteles();
}
