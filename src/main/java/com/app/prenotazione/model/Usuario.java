package com.app.prenotazione.model;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String Apellidos;
    private String Correo;
    private Date Fecha_nacimiento;
    private String DNI;
    private int Telefono;


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

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Telefono == usuario.Telefono && Objects.equals(nombre, usuario.nombre) && Objects.equals(Apellidos, usuario.Apellidos) && Objects.equals(Correo, usuario.Correo) && Objects.equals(Fecha_nacimiento, usuario.Fecha_nacimiento) && Objects.equals(DNI, usuario.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, Apellidos, Correo, Fecha_nacimiento, DNI, Telefono);
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Correo='" + Correo + '\'' +
                ", Fecha_nacimiento=" + Fecha_nacimiento +
                ", DNI='" + DNI + '\'' +
                ", Telefono=" + Telefono +
                '}';
    }
}
