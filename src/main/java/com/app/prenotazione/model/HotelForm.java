package com.app.prenotazione.model;

import com.app.prenotazione.model.Enumerados.Sexo;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class HotelForm {

    private String nombre;
    private String localizacion;
    private String correo;
    private Integer telefono;
    private Habitaciones habitaciones;
}
