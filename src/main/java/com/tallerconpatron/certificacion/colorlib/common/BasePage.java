package com.tallerconpatron.certificacion.colorlib.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }
}
