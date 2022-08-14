package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.product;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class GetAllProductCommand extends Command<GetProductResponse> {

}
