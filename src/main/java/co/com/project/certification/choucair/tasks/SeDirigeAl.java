package co.com.project.certification.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.project.certification.choucair.userinterface.ModuloEmpleoPage.*;

public class SeDirigeAl implements Task {

    public static SeDirigeAl PortalEmpleo() {
        return Tasks.instrumented(SeDirigeAl.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ACEPTAR_COOKIES),
                Click.on(BUTTON_OPCION_PORTAL_EMPLEO),
                Click.on(BUTTON_CONTINUAR)
        );
    }
}
