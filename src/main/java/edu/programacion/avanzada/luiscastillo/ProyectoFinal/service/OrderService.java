package edu.programacion.avanzada.luiscastillo.ProyectoFinal.service;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.domain.Order;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.dto.OrderDTO;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<OrderDTO> getAll() {
        return orderRepository.findAll().stream().map(Order::toDTO).collect(Collectors.toList());
    }

    public OrderDTO get(UUID id) {
        return orderRepository.findById(id).orElseThrow().toDTO();
    }
}
