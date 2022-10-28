package com.app.prenotazione.model;

import com.app.prenotazione.model.Enumerados.Sexo;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class HabitacionesForm {

    private Integer num_habitacion;
    private Integer num_personas;
    private Integer precio;
    private String fecha_entrada;
    private String fecha_salida;
}
