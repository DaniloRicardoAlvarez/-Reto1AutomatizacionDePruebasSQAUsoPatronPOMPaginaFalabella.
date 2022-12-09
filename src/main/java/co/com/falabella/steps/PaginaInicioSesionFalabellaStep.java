package co.com.falabella.steps;

import co.com.falabella.PageObjects.PaginaInicioSesionFalabellaPageObject;
import co.com.falabella.utils.DatosExcel;
import co.com.falabella.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class PaginaInicioSesionFalabellaStep {

    PaginaInicioSesionFalabellaPageObject paginaInicioSesionFalabellaPageObject = new PaginaInicioSesionFalabellaPageObject();
    DatosExcel datosExcel = new DatosExcel();



    @Step
    public void ingresarCorreoUsuario () throws IOException {

        paginaInicioSesionFalabellaPageObject.getDriver().findElement(paginaInicioSesionFalabellaPageObject.getTxtCorreoUsuario())
                .sendKeys(datosExcel.leerDatosExcel("DatosFalabella.xlsx","DatosLogin",1,0));
    }
    @Step
    public void ingresarContrasena () throws IOException {

        paginaInicioSesionFalabellaPageObject.getDriver().findElement(paginaInicioSesionFalabellaPageObject.getTxtContrasena())
                .sendKeys(datosExcel.leerDatosExcel("DatosFalabella.xlsx","DatosLogin",1,1));
    }
    @Step
    public void clicIngresarLogin (){

        paginaInicioSesionFalabellaPageObject.getDriver().findElement(paginaInicioSesionFalabellaPageObject.getBtnIniciarSesion()).click();



    }

    @Step
    public void validarNombreUsuario (){

        Assert.assertThat(paginaInicioSesionFalabellaPageObject.getDriver().findElement
                (paginaInicioSesionFalabellaPageObject.getSmjMensajeValidacion()).isDisplayed(), Matchers.is(true));




    }






}
