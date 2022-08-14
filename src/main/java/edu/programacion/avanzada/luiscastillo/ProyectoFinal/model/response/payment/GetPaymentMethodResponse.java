package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.payment;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto.PaymentMethodDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetPaymentMethodResponse {

    private List<PaymentMethodDTO> paymentMethods;
}
