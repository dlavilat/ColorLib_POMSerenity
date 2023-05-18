package com.tallerconpatron.certificacion.colorlib.step;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaPrincipal;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaLogin;
import net.thucydides.core.annotations.Step;

public class TaskAction extends BasePage {

    private PaginaLogin paginaLogin;
    private PaginaPrincipal paginaPrincipal;

    @Step
    public void openApp(){
        paginaLogin.open();
    }

    @Step
    public void singIn(String user, String password){
        sendKeysUser(user);
        sendKeysPassword(password);
        paginaLogin.btnSingIn.waitUntilClickable().click();
    }

    @Step
    public void verifySingIn(){
        paginaPrincipal.verifySingIn();
        paginaLogin.getDriver().quit();
    }


    public void sendKeysUser(String strUser){
        paginaLogin.user.click();
        paginaLogin.user.clear();
        paginaLogin.user.sendKeys(strUser);
    }

    public void sendKeysPassword(String strPassword){
        paginaLogin.password.click();
        paginaLogin.password.clear();
        paginaLogin.password.waitUntilPresent().sendKeys(strPassword);
    }
}
