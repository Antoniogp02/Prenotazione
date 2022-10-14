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
    @JoinColumn(name = "email")
    private String email;

    @JoinColumn(name = "contrasenya")
    private String contrasenya;
}
