package com.app.prenotazione.model;


import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "usuario")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private int id;

    @JoinColumn(name = "nombre")
    private String nombre;

    @JoinColumn(name = "apellidos")
    private String Apellidos;

    @JoinColumn(name = "correo")
    @ManyToOne(cascade = CascadeType.ALL)
    private Login email;

    @JoinColumn(name = "fecha_nacimiento")
    private Date Fecha_nacimiento;

    @JoinColumn(name = "dni")
    private String DNI;

    @JoinColumn(name = "telefono")
    private Integer Telefono;

    public Usuario(String nombre, String apellidos, String dni, Integer telefono, Login email) {
        this.nombre = nombre;
        this.Apellidos = apellidos;
        this.DNI = dni;
        this.Telefono = telefono;
        this.email = email;
    }
}
