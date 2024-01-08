package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", //Directorios de nuestros archivos .feature
    glue = "steps", //Paquete donde tenemos nuestras clases definiendo los steps en el feature file
    plugin = {"pretty","html:target/cucumber-reports"},
    tags = "@Plans")

public class TestRunner {
    @AfterClass
    public static void cleanDriver() throws InterruptedException{
        Thread.sleep(3000);
        BasePage.closeBrower();
    }
}