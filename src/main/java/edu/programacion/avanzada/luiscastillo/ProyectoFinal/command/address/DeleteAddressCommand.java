package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.address;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.address.DeleteAddressResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteAddressCommand extends Command<DeleteAddressResponse> {

    private Long id;
}