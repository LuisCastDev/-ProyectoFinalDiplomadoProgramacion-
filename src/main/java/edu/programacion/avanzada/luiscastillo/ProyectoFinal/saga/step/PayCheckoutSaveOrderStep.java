package edu.programacion.avanzada.luiscastillo.ProyectoFinal.saga.step;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.saga.handler.PayCheckoutSaveOrderHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class PayCheckoutSaveOrderStep implements SagaStep<PayCheckoutResponse> {

    private final PayCheckoutSaveOrderHandler payCheckoutSaveOrderHandler;

    @Override
    public String getName() {
        return "Save Order";
    }

    @Override
    public SagaStepHandler<PayCheckoutResponse> getHandler() {
        return payCheckoutSaveOrderHandler;
    }

    @Override
    public SagaStepCompensator<PayCheckoutResponse> getCompensator() {
        return null;
    }
}
