package com.app.prenotazione.repository;


import com.app.prenotazione.model.PrecioTransporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Precio_transporteRepository extends JpaRepository<PrecioTransporte,Integer> {
}
