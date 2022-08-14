package edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.address;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetAddressResponse {

    private List<AddressDTO> addresses;
}
