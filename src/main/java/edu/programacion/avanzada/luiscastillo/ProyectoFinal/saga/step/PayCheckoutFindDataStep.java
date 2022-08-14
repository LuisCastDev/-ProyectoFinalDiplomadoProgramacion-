package edu.programacion.avanzada.luiscastillo.ProyectoFinal.saga.step;


import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.saga.handler.PayCheckoutFinDataHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class PayCheckoutFindDataStep implements SagaStep<PayCheckoutResponse> {

    private final PayCheckoutFinDataHandler payCheckoutFinDataHandler;

    @Override
    public String getName() {
        return "Find Data";
    }

    @Override
    public SagaStepHandler<PayCheckoutResponse> getHandler() {
        return payCheckoutFinDataHandler;
    }

    @Override
    public SagaStepCompensator<PayCheckoutResponse> getCompensator() {
        return null;
    }
}
