package co.com.falabella.PageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class PaginaInicioFalabellaPageObject extends PageObject {

    By btnIniciarSesion     =   By.xpath("//p[.='Inicia Sesión']");
    By btnCategoriaProducto =   By.xpath("//span[.='Categorías']");

    public By getBtnIniciarSesion() {

        return btnIniciarSesion;
    }

    public By getBtnCategoriaProducto() {
        return btnCategoriaProducto;
    }




}
