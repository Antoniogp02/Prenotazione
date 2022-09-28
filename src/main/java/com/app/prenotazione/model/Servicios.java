package com.app.prenotazione.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "servicios")
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Boolean internet;
    private Boolean parking;
    private Boolean accesibilidad;
    private Boolean servicio_recepcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(Boolean accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public Boolean getServicio_recepcion() {
        return servicio_recepcion;
    }

    public void setServicio_recepcion(Boolean servicio_recepcion) {
        this.servicio_recepcion = servicio_recepcion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicios servicios = (Servicios) o;
        return id == servicios.id && Objects.equals(internet, servicios.internet) && Objects.equals(parking, servicios.parking) && Objects.equals(accesibilidad, servicios.accesibilidad) && Objects.equals(servicio_recepcion, servicios.servicio_recepcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, internet, parking, accesibilidad, servicio_recepcion);
    }


    @Override
    public String toString() {
        return "Servicios{" +
                "id=" + id +
                ", internet=" + internet +
                ", parking=" + parking +
                ", accesibilidad=" + accesibilidad +
                ", servicio_recepcion=" + servicio_recepcion +
                '}';
    }
}
