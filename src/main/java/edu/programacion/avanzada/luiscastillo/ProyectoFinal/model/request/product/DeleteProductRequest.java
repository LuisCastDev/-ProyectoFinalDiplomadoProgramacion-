package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.request.product;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.product.DeleteProductCommand;
import lombok.*;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteProductRequest {

    @NotNull
    private Long id;

    public DeleteProductCommand toCommand() {
        return DeleteProductCommand.builder()
                .id(id)
                .build();
    }
}
