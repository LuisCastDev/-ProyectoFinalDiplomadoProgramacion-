package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.handler.address;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.address.GetAddressCommand;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto.AddressDTO;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@CommandEvent(command = GetAddressCommand.class)
@Slf4j
public class GetAddressCommandHandler implements CommandHandler<GetAddressResponse, GetAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public GetAddressResponse handle(GetAddressCommand getAddressCommand) {
        log.debug("Get Address {}", getAddressCommand.getId());
        AddressDTO addressDTO = addressRepository.findById(getAddressCommand.getId()).orElseThrow().toDTO();
        return GetAddressResponse.builder()
                .addresses(List.of(addressDTO))
                .build();
    }
}
