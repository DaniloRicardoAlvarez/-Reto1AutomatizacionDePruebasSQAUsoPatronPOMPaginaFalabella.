package co.com.falabella.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCarritoComprasPageObject extends PageObject {

    By txtBarraBusqueda = By.xpath("//input[@id='searchQuestion']");
    By btnBuscarProducto = By.xpath("//a[@class='fb-masthead__util-bar__link fb-masthead-search__box__button-search']");
    By smjValidacion     = By.xpath("//h4[@class='fb-order-status__title']");

    public By getTxtBarraBusqueda() {
        return txtBarraBusqueda;
    }

    public By getBtnBuscarProducto() {
        return btnBuscarProducto;
    }

    public By getSmjValidacion() {
        return smjValidacion;
    }
}
