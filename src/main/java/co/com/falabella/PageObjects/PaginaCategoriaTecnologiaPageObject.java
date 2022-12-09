package co.com.falabella.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCategoriaTecnologiaPageObject extends PageObject {

    By btnProductoTecnologia  = By.xpath("//p[.='Tecnología']");
    By btnAccesorioTv   = By.xpath("//a[.='Accesorios TV']");

    public By getBtnAccesorioTv() {
        return btnAccesorioTv;
    }

    public By getBtnProductoTecnologia() {
        return btnProductoTecnologia;
    }





}
