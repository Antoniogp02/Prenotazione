package com.app.prenotazione.model;

import com.app.prenotazione.model.Enumerados.Sexo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class UserForm {

    private String nombre;
    private String apellidos;
    private String correo;
    private String dni;
    private Integer telefono;
    private Sexo genero;
    private String fecha_nacimiento;



}
