package pages;

public class PaginaIntroSoftwareTesting extends BasePage{

    private String clickIntroTesting = "//a[normalize-space()='Introducción al Testing de Software' and @href]";

    public PaginaIntroSoftwareTesting(){
        super(driver);
    }

    public void introTestingLink(){
        clickElement(clickIntroTesting);
    }    
}