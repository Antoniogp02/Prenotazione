package com.app.prenotazione.repository;


import com.app.prenotazione.model.Transporte;
import com.app.prenotazione.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransporteRepository extends JpaRepository<Vuelo, Integer> {
}
