package com.app.prenotazione.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hoteles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hoteles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nombre;

    @Column
    private String localizacion;

    @Column
    private String correo;


    @Column
    private int telefono;



    @ManyToOne
    @JoinColumn(name = "id_habitaciones")
    private Habitaciones habitaciones;

    @ManyToOne
    @JoinColumn(name = "id_servicios")
    private Servicios servicios;


}
