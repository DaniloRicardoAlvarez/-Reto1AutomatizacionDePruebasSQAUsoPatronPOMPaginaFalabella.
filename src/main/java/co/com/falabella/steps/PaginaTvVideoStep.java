package co.com.falabella.steps;

import co.com.falabella.PageObjects.PaginaTvVideoPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaTvVideoStep {

    PaginaTvVideoPageObject paginaTvVideoPageObject = new PaginaTvVideoPageObject();

    @Step
    public void ClicBarraDeSonido (){

        paginaTvVideoPageObject.getDriver().findElement(paginaTvVideoPageObject.getBtnBarraSonido()).click();
    }

}
