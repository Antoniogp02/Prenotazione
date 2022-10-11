package com.app.prenotazione.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "disponibilidad")
public class Disponibilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int id_habitaciones;

    @Column
    private boolean disponible;

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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disponibilidad that = (Disponibilidad) o;
        return id == that.id && id_habitaciones == that.id_habitaciones && disponible == that.disponible;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_habitaciones, disponible);
    }


    @Override
    public String toString() {
        return "Disponibilidad{" +
                "id=" + id +
                ", id_habitaciones=" + id_habitaciones +
                ", disponible=" + disponible +
                '}';
    }
}