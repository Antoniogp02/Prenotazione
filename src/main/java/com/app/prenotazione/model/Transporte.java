package com.app.prenotazione.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "transporte")
public class Transporte {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int id_usuario;
    private int id_hoteles;
    private String tipo_transporte;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_hoteles() {
        return id_hoteles;
    }

    public void setId_hoteles(int id_hoteles) {
        this.id_hoteles = id_hoteles;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transporte that = (Transporte) o;
        return id == that.id && id_usuario == that.id_usuario && id_hoteles == that.id_hoteles && Objects.equals(tipo_transporte, that.tipo_transporte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_usuario, id_hoteles, tipo_transporte);
    }


    @Override
    public String toString() {
        return "Transporte{" +
                "id=" + id +
                ", id_usuario=" + id_usuario +
                ", id_hoteles=" + id_hoteles +
                ", tipo_transporte='" + tipo_transporte + '\'' +
                '}';
    }

}
