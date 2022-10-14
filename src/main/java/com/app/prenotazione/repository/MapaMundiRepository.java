package com.app.prenotazione.repository;

import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.MapaMundi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapaMundiRepository extends JpaRepository<MapaMundi,Integer> {

    @Query(value = "select m from MapaMundi m order by m.paises ")
    List<MapaMundi> obtenerMapamundi();

}
