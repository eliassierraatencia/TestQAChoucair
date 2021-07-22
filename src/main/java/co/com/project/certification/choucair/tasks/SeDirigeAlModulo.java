package co.com.project.certification.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.project.certification.choucair.userinterface.MenuPage.*;

public class SeDirigeAlModulo implements Task {

    public static SeDirigeAlModulo empleo() {
        return Tasks.instrumented(SeDirigeAlModulo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_MODULO_EMPLEO)
        );
    }
}
