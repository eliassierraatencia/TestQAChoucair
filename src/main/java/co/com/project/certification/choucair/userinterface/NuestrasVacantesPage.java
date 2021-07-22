package co.com.project.certification.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NuestrasVacantesPage {
    public static final Target BUTTON_NUESTRAS_VACANTES = Target.the("").located(By.xpath("(//*[@href='https://www.magneto365.com/es/empleos/choucair'])[5]"));
    public static final Target LABEL_VACANTES = Target.the("").located(By.id("v_title_1"));
}
