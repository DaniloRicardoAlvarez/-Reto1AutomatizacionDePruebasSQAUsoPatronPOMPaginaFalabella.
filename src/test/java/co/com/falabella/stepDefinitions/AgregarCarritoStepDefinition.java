package co.com.falabella.stepDefinitions;

import co.com.falabella.steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AgregarCarritoStepDefinition {

    @Steps
    PaginaInicioFalabellaStep paginaInicioFalabellaStep;
    @Steps
    PaginaCategoriaTecnologiaStep paginaCategoriaTecnologiaStep;
    @Steps
    PaginaTvVideoStep paginaTvVideo;
    @Steps
    PaginaDescripcionProductoStep paginaDescripcionProductoStep;
    @Steps
    PaginaProductoAgregadoBolsaStep paginaProductoAgregadoBolsaStep;
    @Steps
    PaginaCarritoComprasStep paginaCarritoComprasStep;
    @Steps
    PaginaResultadoBusquedaStep paginaResultadoBusquedaStep;


    @Dado("^el usuario se encuentra en la pagina web de falabella$")
    public void elUsuarioSeEncuentraEnLaPaginaWebDeFalabella() {

        paginaInicioFalabellaStep.abrirNavegador();

    }

    @Cuando("^el selecciona un producto por categoria luego otro por caja de busqueda los agrega a carrito$")
    public void elSeleccionaUnProductoPorCategoriaLuegoOtroPorCajaDeBusquedaLosAgregaACarrito() throws IOException {

        paginaInicioFalabellaStep.ClicCategoriasProductos();
        paginaCategoriaTecnologiaStep.ClicCategoriaTecnologia();
        paginaCategoriaTecnologiaStep.ClicAccesorioTv();
        paginaTvVideo.ClicBarraDeSonido();
        paginaDescripcionProductoStep.ClicAgregarACarrito();
        paginaProductoAgregadoBolsaStep.ClicVerBolsaCompras();

        paginaCarritoComprasStep.ingresarProductoABuscar();
        paginaCarritoComprasStep.clicBuscarProducto();
        paginaResultadoBusquedaStep.clicProductoPorBusqueda();
        paginaDescripcionProductoStep.ClicAgregarACarrito();
        paginaProductoAgregadoBolsaStep.ClicVerBolsaCompras();

    }

    @Entonces("^el valida que los productos esten  agregados en el carrito de compras$")
    public void elValidaQueLosProductosEstenAgregadosEnElCarritoDeCompras() {

        paginaCarritoComprasStep.validarMensajeResumenCompra();



    }
}
