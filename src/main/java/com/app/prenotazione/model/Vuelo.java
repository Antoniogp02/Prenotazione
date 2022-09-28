package com.app.prenotazione.model;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "vuelo")
public class Vuelo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String aero_salida;
    private String aero_llegada;
    private int telefono_comp;
    private String tipo_asiento;
    private String cod_vuelo;
    private Date fecha;
    private Float precio;

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

    public String getAero_salida() {
        return aero_salida;
    }

    public void setAero_salida(String aero_salida) {
        this.aero_salida = aero_salida;
    }

    public String getAero_llegada() {
        return aero_llegada;
    }

    public void setAero_llegada(String aero_llegada) {
        this.aero_llegada = aero_llegada;
    }

    public int getTelefono_comp() {
        return telefono_comp;
    }

    public void setTelefono_comp(int telefono_comp) {
        this.telefono_comp = telefono_comp;
    }

    public String getTipo_asiento() {
        return tipo_asiento;
    }

    public void setTipo_asiento(String tipo_asiento) {
        this.tipo_asiento = tipo_asiento;
    }

    public String getCod_vuelo() {
        return cod_vuelo;
    }

    public void setCod_vuelo(String cod_vuelo) {
        this.cod_vuelo = cod_vuelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return id == vuelo.id && telefono_comp == vuelo.telefono_comp && Objects.equals(nombre, vuelo.nombre) && Objects.equals(aero_salida, vuelo.aero_salida) && Objects.equals(aero_llegada, vuelo.aero_llegada) && Objects.equals(tipo_asiento, vuelo.tipo_asiento) && Objects.equals(cod_vuelo, vuelo.cod_vuelo) && Objects.equals(fecha, vuelo.fecha) && Objects.equals(precio, vuelo.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, aero_salida, aero_llegada, telefono_comp, tipo_asiento, cod_vuelo, fecha, precio);
    }


    @Override
    public String toString() {
        return "Vuelo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", aero_salida='" + aero_salida + '\'' +
                ", aero_llegada='" + aero_llegada + '\'' +
                ", telefono_comp=" + telefono_comp +
                ", tipo_asiento='" + tipo_asiento + '\'' +
                ", cod_vuelo='" + cod_vuelo + '\'' +
                ", fecha=" + fecha +
                ", precio=" + precio +
                '}';
    }
}
