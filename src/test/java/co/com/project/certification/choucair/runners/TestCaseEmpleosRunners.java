package co.com.project.certification.choucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/TestCaseModuloEmpleos.feature",
        glue = {"co.com.project.certification.choucair.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class TestCaseEmpleosRunners {
}
