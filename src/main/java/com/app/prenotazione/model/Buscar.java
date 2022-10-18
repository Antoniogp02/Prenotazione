package com.app.prenotazione.model;

import lombok.*;
import java.util.Date;


    @Setter
    @Getter
    @EqualsAndHashCode
    @AllArgsConstructor
    @ToString
    @NoArgsConstructor

    public class Buscar{
        private String hotelBuscar;
        private String fechaSalida;
        private String fechaEntrada;
    }

