package edu.programacion.avanzada.luiscastillo.ProyectoFinal.repositories;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.domain.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckoutRepository extends JpaRepository<UUID, Checkout> {
}

