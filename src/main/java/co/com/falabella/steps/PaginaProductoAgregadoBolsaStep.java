package co.com.falabella.steps;

import co.com.falabella.PageObjects.PaginaProductoAgregadoBolsaPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaProductoAgregadoBolsaStep {

    PaginaProductoAgregadoBolsaPageObject paginaProductoAgregadoBolsaPageObject = new PaginaProductoAgregadoBolsaPageObject();

    @Step
    public void ClicVerBolsaCompras (){

        paginaProductoAgregadoBolsaPageObject.getDriver().findElement(paginaProductoAgregadoBolsaPageObject.getBtnBolsaCompra()).click();

    }
}
