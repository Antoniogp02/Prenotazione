package com.app.prenotazione.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "precioTransporte")
public class PrecioTransporte {


    private int id;
    private Float cantidad;
    private int id_transporte;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_transporte() {
        return id_transporte;
    }

    public void setId_transporte(int id_transporte) {
        this.id_transporte = id_transporte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrecioTransporte that = (PrecioTransporte) o;
        return id == that.id && id_transporte == that.id_transporte && Objects.equals(cantidad, that.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidad, id_transporte);
    }


    @Override
    public String toString() {
        return "Precio_transporte{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", id_transporte=" + id_transporte +
                '}';
    }

}
