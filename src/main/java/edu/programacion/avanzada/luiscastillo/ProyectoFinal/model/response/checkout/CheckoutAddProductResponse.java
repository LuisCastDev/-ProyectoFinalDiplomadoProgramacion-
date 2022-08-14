package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.checkout;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto.CheckoutDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutAddProductResponse {

    private CheckoutDTO checkout;
}