package com.app.prenotazione.repository;

import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value = "select id, nombre, apellidos, correo, fecha_nacimiento, dni, telefono from usuario", nativeQuery = true)
    List<Usuario> obtenerUsuario();
}
