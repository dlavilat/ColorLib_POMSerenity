package com.tallerconpatron.certificacion.colorlib.step;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaPrincipal;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TaskNavigateMenu extends BasePage {

    public PaginaPrincipal paginaPrincipal;

    /*public TaskNavigateMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }*/
    @Step
    public void ingresarMenuForm(){
        paginaPrincipal.menu_form.click();
    }

    @Step
    public void ingresarMenuFormValidation(){
        paginaPrincipal.menu_formValidation.click();
    }
}
