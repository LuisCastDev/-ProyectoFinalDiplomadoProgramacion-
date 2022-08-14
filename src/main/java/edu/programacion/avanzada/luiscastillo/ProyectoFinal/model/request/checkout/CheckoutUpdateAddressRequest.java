package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.request.checkout;

import lombok.*;

import javax.validation.constraints.Size;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutUpdateAddressRequest {

    private UUID id;
    @Size (min = 8, max = 20)
    private Long address;
}

