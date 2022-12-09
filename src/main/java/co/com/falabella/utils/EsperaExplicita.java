package co.com.falabella.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EsperaExplicita {

    public void esperaExplicitaTexto (WebDriver driver, By elemento) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 20);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
}
