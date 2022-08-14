package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutProductDTO {

    private Long id;
    private ProductDTO product;
    private Long quantity;
}
