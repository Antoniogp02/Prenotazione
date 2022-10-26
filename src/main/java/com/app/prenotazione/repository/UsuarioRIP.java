package com.app.prenotazione.repository;

import com.app.prenotazione.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository("usuarioRIP")
public interface UsuarioRIP extends JpaRepository<Usuario, Serializable> {
}
