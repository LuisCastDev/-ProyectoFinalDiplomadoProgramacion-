package edu.programacion.avanzada.luiscastillo.ProyectoFinal.saga.handler;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.domain.Order;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PayCheckoutSaveOrderHandler implements SagaStepHandler<PayCheckoutResponse> {

    private final OrderRepository orderRepository;

    @Override
    public void handle(SagaPayload<PayCheckoutResponse> sagaPayload) {
        Order order = sagaPayload.getProperty(PayCheckoutCommand.ORDER);
        orderRepository.save(order);
    }
}