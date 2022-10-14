package com.app.prenotazione.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "habitaciones")
public class Habitaciones {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int num_habitacion;

    @Column
    private int num_personas;

    @Column
    private Float precio;

    @Column
    private Date fecha_entrada;
    @Column
    private Date fecha_salida;


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

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitaciones that = (Habitaciones) o;
        return id == that.id && num_habitacion == that.num_habitacion && num_personas == that.num_personas && Objects.equals(precio, that.precio) && Objects.equals(fecha_entrada, that.fecha_entrada) && Objects.equals(fecha_salida, that.fecha_salida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num_habitacion, num_personas, precio, fecha_entrada, fecha_salida);
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
                '}';
    }
}
