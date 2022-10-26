package com.app.prenotazione.model;
import lombok.*;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "login")
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode

public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JoinColumn(name = "email")
    private String email;

    @JoinColumn(name = "contrasenya")
    private String contrasenya;


    @JoinColumn(name = "rol")
    private String rol;
}
