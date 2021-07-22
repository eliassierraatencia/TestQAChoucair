package co.com.project.certification.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import java.util.Set;

import static co.com.project.certification.choucair.userinterface.NuestrasVacantesPage.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class IngresarOpcion implements Task {
    public static IngresarOpcion conoceNuestrasVacantes() {
        return Tasks.instrumented(IngresarOpcion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String mainTab = getDriver().getWindowHandle();
        String newTab = "";
        System.out.println("Main Tap: "+mainTab);

        actor.attemptsTo(
                Click.on(BUTTON_NUESTRAS_VACANTES)
        );

        Set<String> handles = getDriver().getWindowHandles();

        for (String actual: handles){
            System.out.println("-- handles ID: "+actual);
            if (!actual.equalsIgnoreCase(mainTab)){
                System.out.println("Changing Tab -- ");
                getDriver().switchTo().window(actual);
                newTab=actual;
            }
        }
    }
}
