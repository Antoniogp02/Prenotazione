package com.app.prenotazione.repository;


import com.app.prenotazione.model.Precio_transporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Precio_transporteRepository extends JpaRepository<Precio_transporte,Integer> {
}
