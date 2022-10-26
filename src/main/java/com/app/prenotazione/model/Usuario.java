package com.app.prenotazione.model;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String Apellidos;
    @Column(name = "correo")
    private String Correo;
    @Column(name = "dni")
    private String Dni;
    @Column(name = "genero")
    private Boolean Genero;
    @Column(name = "fecha_nacimiento")
    private Date Fecha_nacimiento;

    @Column(name = "telefono")
    private int Telefono;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellidos, String correo, String dni, Boolean genero, Date fecha_nacimiento, int telefono) {
        this.id = id;
        this.nombre = nombre;
        Apellidos = apellidos;
        Correo = correo;
        Dni = dni;
        Genero = genero;
        Fecha_nacimiento = fecha_nacimiento;
        Telefono = telefono;
    }

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

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public Boolean getGenero() {
        return Genero;
    }

    public void setGenero(Boolean genero) {
        Genero = genero;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Correo='" + Correo + '\'' +
                ", Dni='" + Dni + '\'' +
                ", Genero=" + Genero +
                ", Fecha_nacimiento=" + Fecha_nacimiento +
                ", Telefono=" + Telefono +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Telefono == usuario.Telefono && Objects.equals(nombre, usuario.nombre) && Objects.equals(Apellidos, usuario.Apellidos) && Objects.equals(Correo, usuario.Correo) && Objects.equals(Dni, usuario.Dni) && Objects.equals(Genero, usuario.Genero) && Objects.equals(Fecha_nacimiento, usuario.Fecha_nacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, Apellidos, Correo, Dni, Genero, Fecha_nacimiento, Telefono);
    }
}
