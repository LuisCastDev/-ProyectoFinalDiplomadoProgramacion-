package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.product;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetProductCommand extends Command<GetProductResponse> {

    private Long id;
}

