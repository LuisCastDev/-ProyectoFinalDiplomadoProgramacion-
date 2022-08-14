package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.address;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class GetAllAddressCommand extends Command<GetAddressResponse> {

    private int pageSize;
    private int page;
    private String name;

}
