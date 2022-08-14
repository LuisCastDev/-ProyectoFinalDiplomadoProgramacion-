package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.address;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetAddressCommand extends Command<GetAddressResponse> {

    private Long id;
}