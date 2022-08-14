package edu.programacion.avanzada.luiscastillo.ProyectoFinal.repositories;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.domain.CheckoutProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckoutProductRepository extends JpaRepository<CheckoutProduct, Long> {
}

