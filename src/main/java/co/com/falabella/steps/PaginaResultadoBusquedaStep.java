package co.com.falabella.steps;

import co.com.falabella.PageObjects.PaginaResultadoBusquedaPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaResultadoBusquedaStep {

    PaginaResultadoBusquedaPageObject paginaResultadoBusquedaPageObject = new PaginaResultadoBusquedaPageObject();

    @Step
    public void clicProductoPorBusqueda (){

        paginaResultadoBusquedaPageObject.getDriver().findElement(paginaResultadoBusquedaPageObject.getBtnProductoBuscado()).click();

    }
}
