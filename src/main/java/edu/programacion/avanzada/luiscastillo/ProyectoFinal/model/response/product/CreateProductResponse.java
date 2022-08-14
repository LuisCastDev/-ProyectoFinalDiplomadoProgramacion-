package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.product;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateProductResponse {

    private ProductDTO product;
}
