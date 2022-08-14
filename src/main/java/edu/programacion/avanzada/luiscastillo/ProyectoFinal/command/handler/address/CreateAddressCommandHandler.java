package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.handler.address;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.address.CreateAddressCommand;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.domain.Address;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@CommandEvent(command = CreateAddressCommand.class)
@Slf4j
public class CreateAddressCommandHandler implements CommandHandler<CreateAddressResponse, CreateAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public CreateAddressResponse handle(CreateAddressCommand createAddressCommand) {
        Address address = addressRepository.save(createAddressCommand.toAddress());
        log.info("Address {} created", address.getId());
        return CreateAddressResponse.builder()
                .address(address.toDTO())
                .build();
    }
}