package com.app.prenotazione.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hoteles")
public class Hoteles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String localizacion;
    private String correo;
    private int telefono;
    private int id_habitaciones;
    private int id_servicios;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId_habitaciones() {
        return id_habitaciones;
    }

    public void setId_habitaciones(int id_habitaciones) {
        this.id_habitaciones = id_habitaciones;
    }

    public int getId_servicios() {
        return id_servicios;
    }

    public void setId_servicios(int id_servicios) {
        this.id_servicios = id_servicios;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hoteles hoteles = (Hoteles) o;
        return id == hoteles.id && telefono == hoteles.telefono && id_habitaciones == hoteles.id_habitaciones && id_servicios == hoteles.id_servicios && Objects.equals(nombre, hoteles.nombre) && Objects.equals(localizacion, hoteles.localizacion) && Objects.equals(correo, hoteles.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, localizacion, correo, telefono, id_habitaciones, id_servicios);
    }


    @Override
    public String toString() {
        return "Hoteles{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", id_habitaciones=" + id_habitaciones +
                ", id_servicios=" + id_servicios +
                '}';
    }
}
