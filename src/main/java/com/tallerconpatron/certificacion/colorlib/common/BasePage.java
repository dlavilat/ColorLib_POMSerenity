package com.tallerconpatron.certificacion.colorlib.common;

import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaLogin;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public static WebDriver driver;

    private PaginaLogin paginaLogin;

    public void openApp(){
        paginaLogin.open();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
