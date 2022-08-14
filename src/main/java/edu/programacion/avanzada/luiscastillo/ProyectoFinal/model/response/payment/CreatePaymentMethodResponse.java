package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.payment;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto.PaymentMethodDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentMethodResponse {

    private PaymentMethodDTO paymentMethod;
}

