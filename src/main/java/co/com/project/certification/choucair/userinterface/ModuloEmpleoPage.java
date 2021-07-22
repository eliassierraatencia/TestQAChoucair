package co.com.project.certification.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModuloEmpleoPage {
    public static final Target BUTTON_ACEPTAR_COOKIES  = Target.the("").located(By.id("cookie_action_close_header"));
    public static final Target BUTTON_OPCION_PORTAL_EMPLEO = Target.the("").located(By.xpath("(//span[contains(text(),'Ir al portal de empleos')])[1]"));
    public static final Target BUTTON_CONTINUAR = Target.the("").located(By.xpath("//*[@href='https://www.magneto365.com/choucair']"));

}
