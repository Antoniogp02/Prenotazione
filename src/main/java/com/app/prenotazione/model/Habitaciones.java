package com.app.prenotazione.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "habitaciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Habitaciones {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Integer id;


    @JoinColumn(name = "num_habitacion")
    private Integer num_habitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hotel")
    private Hoteles id_hotel;

    @JoinColumn(name = "num_personas")
    private Integer num_personas;

    @JoinColumn(name = "precio")
    private Double precio;

    @JoinColumn(name = "tipo_hab")
    private TipoHabitacion tipo_hab;

    @JoinColumn(name = "fecheEntrada")
    private Date fecha_entrada;

    @JoinColumn(name = "fechaSalida")
    private Date fecha_salida;

}
