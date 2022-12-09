package co.com.falabella.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaResultadoBusquedaPageObject extends PageObject {

    By btnProductoBuscado = By.xpath("//b[.='Televisor Lg 55 Pulgadas Uhd Smart Tv']");

    public By getBtnProductoBuscado() {
        return btnProductoBuscado;
    }
}
