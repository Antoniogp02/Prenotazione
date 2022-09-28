package com.app.prenotazione.model;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int num_reserva;
    private Float precio_total;
    private Date fecha_entrada;
    private Date fecha_salida;
    private String lugar_destino;
    private int num_habitaciones;
    private int id_usuario;
    private int id_hoteles;
    private int id_transporte;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_reserva() {
        return num_reserva;
    }

    public void setNum_reserva(int num_reserva) {
        this.num_reserva = num_reserva;
    }

    public Float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Float precio_total) {
        this.precio_total = precio_total;
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

    public String getLugar_destino() {
        return lugar_destino;
    }

    public void setLugar_destino(String lugar_destino) {
        this.lugar_destino = lugar_destino;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
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
        Reserva reserva = (Reserva) o;
        return id == reserva.id && num_reserva == reserva.num_reserva && num_habitaciones == reserva.num_habitaciones && id_usuario == reserva.id_usuario && id_hoteles == reserva.id_hoteles && id_transporte == reserva.id_transporte && Objects.equals(precio_total, reserva.precio_total) && Objects.equals(fecha_entrada, reserva.fecha_entrada) && Objects.equals(fecha_salida, reserva.fecha_salida) && Objects.equals(lugar_destino, reserva.lugar_destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num_reserva, precio_total, fecha_entrada, fecha_salida, lugar_destino, num_habitaciones, id_usuario, id_hoteles, id_transporte);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", num_reserva=" + num_reserva +
                ", precio_total=" + precio_total +
                ", fecha_entrada=" + fecha_entrada +
                ", fecha_salida=" + fecha_salida +
                ", lugar_destino='" + lugar_destino + '\'' +
                ", num_habitaciones=" + num_habitaciones +
                ", id_usuario=" + id_usuario +
                ", id_hoteles=" + id_hoteles +
                ", id_transporte=" + id_transporte +
                '}';
    }
}
