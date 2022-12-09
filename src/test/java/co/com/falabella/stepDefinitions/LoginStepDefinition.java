package co.com.falabella.stepDefinitions;

import co.com.falabella.steps.PaginaInicioSesionFalabellaStep;
import co.com.falabella.steps.PaginaInicioFalabellaStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    PaginaInicioFalabellaStep paginaInicioFalabellaStep;
    @Steps
    PaginaInicioSesionFalabellaStep paginaInicioSesionFalabellaStep;

    @Dado("^el usuario se encuentra en la pagina web falabella$")
    public void elUsuarioSeEncuentraEnLaPaginaWebLinio() {

        paginaInicioFalabellaStep.abrirNavegador();
        paginaInicioFalabellaStep.clicIniciarSesion();

    }

    @Cuando("^el ingrese el usuario con la contrasena da iniciar sesion$")
    public void elIngreseElUsuarioConLaContrasenaDaIniciarSesion() throws IOException {

        paginaInicioSesionFalabellaStep.ingresarCorreoUsuario();
        paginaInicioSesionFalabellaStep.ingresarContrasena();
        paginaInicioSesionFalabellaStep.clicIngresarLogin();


    }

    @Entonces("^el visualizara un mensaje en la pagina de usuario con su nombre$")
    public void elVisualizaraUnMensajeEnLaPaginaDeUsuarioConSuNombre() {

        paginaInicioSesionFalabellaStep.validarNombreUsuario();

    }

}
