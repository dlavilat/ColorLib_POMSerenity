package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PaginaForm extends PageObject {

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/header/h5")
    public WebElementFacade lbl_tituloForm;

    @FindBy(xpath = "//*[@id=\"req\"]")
    public WebElementFacade txt_required;

    @FindBy(xpath = "//*[@id=\"sport\"]")
    public WebElementFacade select_sport;

    @FindBy(xpath = "//*[@id=\"sport2\"]")
    public WebElementFacade select_multiple;

    @FindBy(xpath = "//*[@id=\"url1\"]")
    public WebElementFacade txt_url;

    @FindBy(xpath = "//*[@id=\"email1\"]")
    public WebElementFacade txt_email;

    @FindBy(xpath = "//*[@id=\"pass1\"]")
    public WebElementFacade txt_password;

    @FindBy(xpath = "//*[@id=\"pass2\"]")
    public WebElementFacade txt_confirmPassword;

    @FindBy(xpath = "//*[@id=\"minsize1\"]")
    public WebElementFacade txt_minimumField;

    @FindBy(xpath = "//*[@id=\"maxsize1\"]")
    public WebElementFacade txt_maximumField;

    public void verifySingIn(){
        assertThat(lbl_tituloForm.isCurrentlyEnabled(), is(true));
    }
}
