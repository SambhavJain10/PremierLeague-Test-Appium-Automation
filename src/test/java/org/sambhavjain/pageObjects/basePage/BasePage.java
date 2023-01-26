package org.sambhavjain.pageObjects.basePage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.sambhavjain.pageObjects.welcome.BaseWelcomePage;

public class BasePage {

    public AndroidDriver<WebElement> driver;
    public BasePage(){

        BaseWelcomePage baseWelcomePage=new BaseWelcomePage(driver);
    }
}
