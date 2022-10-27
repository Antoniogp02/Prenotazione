package com.app.prenotazione.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hoteles")
public class Hoteles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "localizacion")
    private String localizacion;

    @Column (name = "correo")
    private String correo;


    @Column (name = "telefono")
    private int telefono;



    @ManyToOne
    @JoinColumn(name = "id_habitaciones")
    private Habitaciones habitaciones;


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

    public Habitaciones getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitaciones habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hoteles hoteles = (Hoteles) o;
        return id == hoteles.id && telefono == hoteles.telefono && Objects.equals(nombre, hoteles.nombre) && Objects.equals(localizacion, hoteles.localizacion) && Objects.equals(correo, hoteles.correo) && Objects.equals(habitaciones, hoteles.habitaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, localizacion, correo, telefono, habitaciones);
    }


    @Override
    public String toString() {
        return "Hoteles{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", habitaciones=" + habitaciones +
                '}';
    }
}
