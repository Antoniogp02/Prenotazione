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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private int num_habitacion;
    @Column
    private Hoteles hotel;
    @Enumerated
    private EnumType suite, doble, basica, imperial;
    @Column
    private int num_personas;
    @Column
    private Float precio;
    @Column
    private Date fecha_entrada;
    @Column
    private Date fecha_salida;

}
