package co.com.falabella.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioSesionFalabellaPageObject extends PageObject {

    By txtCorreoUsuario     = By.xpath("//input[@id='testId-cc-login-form-email-input']");
    By txtContrasena        = By.xpath("//input[@id='testId-cc-login-form-password-input']");
    By btnIniciarSesion     = By.xpath("//span[.='Ingresar']");
    By smjMensajeValidacion =   By.xpath("//span[.='Ingresar']");

    public By getTxtCorreoUsuario() {
        return txtCorreoUsuario;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public By getSmjMensajeValidacion() {
        return smjMensajeValidacion;
    }
}
