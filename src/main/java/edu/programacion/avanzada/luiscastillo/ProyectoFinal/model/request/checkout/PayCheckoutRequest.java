package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.request.checkout;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.checkout.PayCheckoutCommand;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PayCheckoutRequest {

    @NotBlank
    private UUID id;

    public PayCheckoutCommand toCommand() {
        return PayCheckoutCommand.builder()
                .id(id)
                .build();
    }
}