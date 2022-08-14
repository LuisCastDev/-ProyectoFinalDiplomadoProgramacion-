package edu.programacion.avanzada.luiscastillo.ProyectoFinal.repositories;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
}