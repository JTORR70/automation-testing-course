package pages;

import org.testng.annotations.Test;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageTest {

    protected WebDriver driver;

    @BeforeAll
    public void setUp() {
        //Inicializa el WebDriver para Chrome
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options); 
    }

    @Test
    public void navegamosAFreeRangeTesters(){
        //Navega a la pagina web
        driver.get("https://www.freerangetesters.com");
    }

    @AfterAll
    public void tearDown(){
        //Cierra en navegador despues de la prueba
        driver.quit();
    }

}