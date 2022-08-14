package edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.saga.model;


public interface SagaStepCompensator<T> {

    void handle(SagaPayload<T> sagaPayload);
}

