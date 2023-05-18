package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PaginaPrincipal extends PageObject {

    @FindBy(xpath = "//*[@id=\"menu\"]/li[1]")
    public static WebElementFacade lbl_menu;

    public void verifySingIn(){
        assertThat(lbl_menu.isCurrentlyEnabled(), is(true));
    }
}
