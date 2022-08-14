package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.request.address;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.address.DeleteAddressCommand;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteAddressRequest {

    private Long id;

    public DeleteAddressCommand toCommand() {
        return DeleteAddressCommand.builder()
                .id(id)
                .build();
    }
}