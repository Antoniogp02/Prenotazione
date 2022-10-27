package com.app.prenotazione.repository;

import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository("hotelesRIP")
public interface HotelesRIP extends JpaRepository<Hoteles, Serializable> {
}
