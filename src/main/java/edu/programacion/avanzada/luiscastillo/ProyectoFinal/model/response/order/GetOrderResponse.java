package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.order;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto.OrderDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetOrderResponse {

    private List<OrderDTO> orders;
}