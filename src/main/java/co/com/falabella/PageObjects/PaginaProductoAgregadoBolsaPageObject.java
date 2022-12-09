package co.com.falabella.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaProductoAgregadoBolsaPageObject extends PageObject {


    By btnBolsaCompra = By.xpath("//a[.='Ver Bolsa de Compras']");

    public By getBtnBolsaCompra() {
        return btnBolsaCompra;
    }
}
