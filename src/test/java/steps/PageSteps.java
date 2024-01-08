package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaIntroSoftwareTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

public class PageSteps {
    
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroSoftwareTesting introSoftwareTesting = new PaginaIntroSoftwareTesting();
    PaginaRegistro registro = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }

    @When("Selecciono un plan")
    public void clickOnThePlanButton(){
        landingPage.clickOnThePlanButton();
    }

    @Then("Puedo validar las opciones de los planes")
    public void validateCheckoutPlan(){
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 11 productos",
        "Academia: $176 / año • 11 productos","Free: Gratis • 1 producto");

        Assert.assertEquals(listaEsperada, lista);
    }

    // @When("I go to {word} using the navigation bar")
    // public void navigationBarUse(String section){
    //     landingPage.clickOnSectionNavigationBar(section);
    // }

    // @And("select Fundamentos del Testing")
    // public void navigateToIntro(){
    //     cursosPage.clickFundamentosTestingLink();
    // }

    // @Then("Voy al curso de Introducción al Testing de Software")
    // public void navigateToCourse(){
    //     introSoftwareTesting.introTestingLink();
    // }
}
