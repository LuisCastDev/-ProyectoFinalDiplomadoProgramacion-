package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.exceptions;

public class BadSagaException extends RuntimeException {

    public BadSagaException() {
        super("Error en el Saga");
    }
}
