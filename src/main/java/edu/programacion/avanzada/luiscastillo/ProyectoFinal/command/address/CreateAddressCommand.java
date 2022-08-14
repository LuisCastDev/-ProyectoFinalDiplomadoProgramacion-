package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.address;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.domain.Address;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateAddressCommand extends Command<CreateAddressResponse> {

    private String name;
    private String description;

    public Address toAddress() {
        return Address.builder()
                .name(name)
                .description(description)
                .build();
    }
}