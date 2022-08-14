package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.exceptions;

import java.text.MessageFormat;
import java.util.UUID;

public class CheckoutAddressNoAssignedException extends RuntimeException {

    public CheckoutAddressNoAssignedException(UUID id) {
        super(MessageFormat.format("No Address in checkout {0} ", id));
    }
}