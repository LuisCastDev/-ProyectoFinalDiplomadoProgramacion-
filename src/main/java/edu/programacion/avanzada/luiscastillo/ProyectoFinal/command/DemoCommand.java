package edu.programacion.avanzada.luiscastillo.ProyectoFinal.command;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DemoCommand extends Command<DemoResponse> {

    private boolean explote;
}

