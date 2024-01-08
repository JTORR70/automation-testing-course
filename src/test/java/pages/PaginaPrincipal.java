package pages;

public class PaginaPrincipal extends BasePage{

    private String sectionLink = "//a[normalize-space()='Cursos' and @href]";
    private String elegirPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    public PaginaPrincipal(){
        super(driver);
    }

    //Metodo para navegar a la url
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com/");
    }

    public void clickOnSectionNavigationBar(String section){
        //Reemplazar el marcador de posicion en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnThePlanButton(){
        clickElement(elegirPlanButton);
    }
}
