package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.product;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.product.DeleteProductResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteProductCommand extends Command<DeleteProductResponse> {

    private Long id;
}
