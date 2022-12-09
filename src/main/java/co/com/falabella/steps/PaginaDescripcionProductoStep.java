package co.com.falabella.steps;

import co.com.falabella.PageObjects.PaginaDescripcionProductoPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaDescripcionProductoStep {

    PaginaDescripcionProductoPageObject paginaDescripcionProductoPageObject = new PaginaDescripcionProductoPageObject();

    @Step
    public void ClicAgregarACarrito (){

        paginaDescripcionProductoPageObject.getDriver().findElement(paginaDescripcionProductoPageObject.getBtnAgregarBolsa()).click();
    }
}
