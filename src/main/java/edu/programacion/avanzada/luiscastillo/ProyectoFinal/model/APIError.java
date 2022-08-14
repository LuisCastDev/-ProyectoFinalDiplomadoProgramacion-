package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class APIError {

    private int status;
    private String message;
}
