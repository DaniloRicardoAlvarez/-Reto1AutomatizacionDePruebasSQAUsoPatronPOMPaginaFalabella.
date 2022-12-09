package co.com.falabella.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaDescripcionProductoPageObject extends PageObject {

    By btnAgregarBolsa = By.xpath("//button[.='Agregar a la Bolsa']");

    public By getBtnAgregarBolsa() {
        return btnAgregarBolsa;
    }
}
