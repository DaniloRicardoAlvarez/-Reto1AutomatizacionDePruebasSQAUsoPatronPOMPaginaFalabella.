package co.com.falabella.steps;

import co.com.falabella.PageObjects.PaginaInicioFalabellaPageObject;
import co.com.falabella.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaInicioFalabellaStep {

    PaginaInicioFalabellaPageObject paginaInicioFalabellaPageObject = new PaginaInicioFalabellaPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();


    @Step
    public void abrirNavegador(){

        paginaInicioFalabellaPageObject.open();

    }

    @Step
    public void clicIniciarSesion(){
        paginaInicioFalabellaPageObject.getDriver().findElement(paginaInicioFalabellaPageObject.getBtnIniciarSesion()).click();

    }


    @Step
    public void ClicCategoriasProductos (){
        paginaInicioFalabellaPageObject.getDriver().findElement(paginaInicioFalabellaPageObject
                .getBtnCategoriaProducto()).click();
    }

    



}
