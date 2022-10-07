package com.app.prenotazione.repository;


import com.app.prenotazione.model.Transporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransporteRepository extends JpaRepository<Transporte, Integer> {
}
