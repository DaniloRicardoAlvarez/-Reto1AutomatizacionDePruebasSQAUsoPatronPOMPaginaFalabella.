package co.com.falabella.steps;

import co.com.falabella.PageObjects.PaginaCarritoComprasPageObject;
import co.com.falabella.utils.DatosExcel;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class PaginaCarritoComprasStep {

    PaginaCarritoComprasPageObject paginaCarritoComprasPageObject = new PaginaCarritoComprasPageObject();
    DatosExcel datosExcel = new DatosExcel();


    @Step
    public void ingresarProductoABuscar () throws IOException {

        paginaCarritoComprasPageObject.getDriver().findElement(paginaCarritoComprasPageObject.getTxtBarraBusqueda())
                .sendKeys(datosExcel.leerDatosExcel("DatosFalabella.xlsx","DatoProductoABuscar",1,0));
    }

    @Step
    public void clicBuscarProducto (){

        paginaCarritoComprasPageObject.getDriver().findElement(paginaCarritoComprasPageObject.getBtnBuscarProducto()).click();
    }

    @Step
    public void validarMensajeResumenCompra (){



        Assert.assertThat(paginaCarritoComprasPageObject.getDriver().findElement
                (paginaCarritoComprasPageObject.getSmjValidacion()).isDisplayed(), Matchers.is(true));


    }
}
