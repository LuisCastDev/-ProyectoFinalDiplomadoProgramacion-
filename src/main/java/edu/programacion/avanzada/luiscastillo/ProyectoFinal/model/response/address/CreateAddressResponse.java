package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.address;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateAddressResponse {

    private AddressDTO address;
}