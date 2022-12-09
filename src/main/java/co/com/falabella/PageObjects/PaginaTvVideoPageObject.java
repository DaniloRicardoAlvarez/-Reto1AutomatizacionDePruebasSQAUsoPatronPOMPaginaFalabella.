package co.com.falabella.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaTvVideoPageObject extends PageObject {

    By btnBarraSonido = By.id("testId-pod-displaySubTitle-3917775");

    public By getBtnBarraSonido() {
        return btnBarraSonido;
    }
}
