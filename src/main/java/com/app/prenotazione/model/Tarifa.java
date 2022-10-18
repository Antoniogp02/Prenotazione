package com.app.prenotazione.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "tarifa")
public class Tarifa {


    @Id
    private int id;
    private int id_habitaciones;
    private int id_hotel;
    private Float cantidad;
    private String temporada;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_habitaciones() {
        return id_habitaciones;
    }

    public void setId_habitaciones(int id_habitaciones) {
        this.id_habitaciones = id_habitaciones;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getid_hotel() {
        return id_hotel;
    }

    public void setid_hotel(Integer id_hotel) {
        this.id_hotel = id_hotel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarifa tarifa = (Tarifa) o;
        return id == tarifa.id && id_habitaciones == tarifa.id_habitaciones && Objects.equals(cantidad, tarifa.cantidad) && Objects.equals(temporada, tarifa.temporada) && Objects.equals(id_hotel, tarifa.id_hotel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_habitaciones, cantidad, temporada, id_hotel);
    }


    @Override
    public String toString() {
        return "Tarifa{" +
                "id=" + id +
                ", id_habitaciones=" + id_habitaciones +
                ", id_hotel=" + id_hotel +
                ", cantidad=" + cantidad +
                ", temporada='" + temporada + '\'' +
                '}';
    }
}
