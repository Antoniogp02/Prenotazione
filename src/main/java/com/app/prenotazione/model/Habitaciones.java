package com.app.prenotazione.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "habitaciones")

public class Habitaciones {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JoinColumn(name = "num_habitacion")
    private int num_habitacion;

    @JoinColumn(name = "num_personas")
    private int num_personas;

    @JoinColumn(name = "precio")
    private Double precio;

    @JoinColumn(name = "Fecha_entrada")
    private LocalDate fecha_entrada;

    @JoinColumn(name = "fecha_salida")
    private LocalDate fecha_salida;

    @ManyToOne
    @JoinColumn(name = "id_hoteles")
    private Hoteles hoteles;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(int num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public int getNum_personas() {
        return num_personas;
    }

    public void setNum_personas(int num_personas) {
        this.num_personas = num_personas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(LocalDate fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public LocalDate getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Hoteles getHoteles() {
        return hoteles;
    }

    public void setHoteles(Hoteles hoteles) {
        this.hoteles = hoteles;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitaciones that = (Habitaciones) o;
        return id == that.id && num_habitacion == that.num_habitacion && num_personas == that.num_personas && Objects.equals(precio, that.precio) && Objects.equals(fecha_entrada, that.fecha_entrada) && Objects.equals(fecha_salida, that.fecha_salida) && Objects.equals(hoteles, that.hoteles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num_habitacion, num_personas, precio, fecha_entrada, fecha_salida, hoteles);
    }

    @Override
    public String toString() {
        return "Habitaciones{" +
                "id=" + id +
                ", num_habitacion=" + num_habitacion +
                ", num_personas=" + num_personas +
                ", precio=" + precio +
                ", fecha_entrada=" + fecha_entrada +
                ", fecha_salida=" + fecha_salida +
                ", hoteles=" + hoteles +
                '}';
    }
}
