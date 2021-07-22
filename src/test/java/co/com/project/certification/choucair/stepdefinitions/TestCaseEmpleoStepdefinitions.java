package co.com.project.certification.choucair.stepdefinitions;

import co.com.project.certification.choucair.questions.Verificar;
import co.com.project.certification.choucair.tasks.AbrirLaPagina;
import co.com.project.certification.choucair.tasks.IngresarOpcion;
import co.com.project.certification.choucair.tasks.SeDirigeAl;
import co.com.project.certification.choucair.tasks.SeDirigeAlModulo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TestCaseEmpleoStepdefinitions {
    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingresa a la pagina choucairtesting$")
    public void eliasIngresaALaPaginaChoucairtesting(String strActor) throws Exception {
        theActorCalled(strActor).wasAbleTo(AbrirLaPagina.choucair());
    }

    @When("^Selecciona en el menu el modulo de Empleo$")
    public void seleccionaEnElMenuElModuloDeEmpleo() throws Exception {
        theActorInTheSpotlight().attemptsTo(SeDirigeAlModulo.empleo());
    }

    @When("^Selecciona la opcion portal de empleo$")
    public void seleccionaLaOpcionPortalDeEmpleo() throws Exception {
        theActorInTheSpotlight().attemptsTo(SeDirigeAl.PortalEmpleo());
    }

    @When("^ingresa a la opcion conoce nuestras vacantes$")
    public void ingresaALaOpcionConoceNuestrasVacantes() throws Exception {
        theActorInTheSpotlight().attemptsTo(IngresarOpcion.conoceNuestrasVacantes());
    }

    @Then("^debe mostrar el la oferta (.*)$")
    public void debeMostrarElLaOferta(String mjsEsperado) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultadoEs(mjsEsperado)));
    }
}
