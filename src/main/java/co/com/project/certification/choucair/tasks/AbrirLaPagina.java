package co.com.project.certification.choucair.tasks;

import co.com.project.certification.choucair.userinterface.PaginaInicialChoucair;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaPagina implements Task {
    private PaginaInicialChoucair paginaInicialChoucair;

    public static AbrirLaPagina choucair() {
        return Tasks.instrumented(AbrirLaPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicialChoucair));
    }
}
