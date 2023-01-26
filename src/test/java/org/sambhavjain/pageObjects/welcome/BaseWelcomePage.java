package org.sambhavjain.pageObjects.welcome;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sambhavjain.utils.Helper;
import org.testng.Assert;

public class BaseWelcomePage extends Helper {


    @FindBy (id="com.pl.premierleague:id/logo")
    public WebElement welcomeLogoElement;

    @FindBy(id="com.pl.premierleague:id/title")
    public WebElement welcomeTitleElement;

    @FindBy  (id="com.pl.premierleague:id/description")
    public WebElement welcomeDescElement;

  /*  @AndroidFindBy  (id="com.pl.premierleague:id/next_button")
    WebElement getStartedBtn;*/

    @FindBy  (id="com.pl.premierleague:id/next_button")
    public WebElement getStartedBtn;

    @FindBy  (id="com.pl.premierleague:id/have_an_account")
    public WebElement alreadyActElement;

    @FindBy  (id="com.pl.premierleague:id/login_button")
    public WebElement loginElement;

    public void initialization(AndroidDriver driver){

        PageFactory.initElements(driver, this)  ;

    }
    public void validateWelcomeTitle(){

        Assert.assertEquals(welcomeTitleElement.getText(), "Welcome!");

    }

    public void validateWelcomeDescription(){

        Assert.assertEquals(welcomeDescElement.getText(), "Help us tailor your experience by answering a few quick and easy questions");

    }
}
