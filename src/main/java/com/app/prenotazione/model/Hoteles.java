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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Integer id;

    @JoinColumn
    private String nombre;

    @JoinColumn
    private String localizacion;

    @JoinColumn
    private String correo;

    @JoinColumn
    private Integer telefono;



    @ManyToOne
    @JoinColumn(name = "id_habitaciones")
    private Habitaciones habitaciones;

    @ManyToOne
    @JoinColumn(name = "id_servicios")
    private Servicios servicios;


}
