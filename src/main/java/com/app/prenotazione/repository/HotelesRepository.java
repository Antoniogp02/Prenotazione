package com.app.prenotazione.repository;


import com.app.prenotazione.model.Hoteles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelesRepository extends JpaRepository<Hoteles,Integer>{
}
