package co.com.falabella.steps;

import co.com.falabella.PageObjects.PaginaCategoriaTecnologiaPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaCategoriaTecnologiaStep {

    PaginaCategoriaTecnologiaPageObject paginaCategoriaTecnologiaPageObject = new PaginaCategoriaTecnologiaPageObject();


    @Step
    public void ClicCategoriaTecnologia (){
        paginaCategoriaTecnologiaPageObject.getDriver().findElement(paginaCategoriaTecnologiaPageObject
                .getBtnProductoTecnologia()).click();

    }

    @Step
    public void ClicAccesorioTv (){
        paginaCategoriaTecnologiaPageObject.getDriver().findElement(paginaCategoriaTecnologiaPageObject
                .getBtnAccesorioTv()).click();
    }


}
