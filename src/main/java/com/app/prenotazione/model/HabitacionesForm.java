package com.app.prenotazione.model;

import com.app.prenotazione.model.Enumerados.Sexo;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class HabitacionesForm {

    private int num_habitacion;
    private int num_personas;
    private int precio;
    private String fecha_entrada;
    private String fecha_salida;
}
