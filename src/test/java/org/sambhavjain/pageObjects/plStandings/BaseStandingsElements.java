package org.sambhavjain.pageObjects.plStandings;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sambhavjain.utils.Helper;
import org.testng.Assert;

public class BaseStandingsElements extends Helper {

    @FindBy (id="com.pl.premierleague:id/logo")
    public WebElement welcomeLogoElement;

    @FindBy(id="com.pl.premierleague:id/title")
    public WebElement welcomeTitleElement;

    @FindBy  (id="com.pl.premierleague:id/description")
    public WebElement welcomeDescElement;
    @FindBy (id="com.pl.premierleague:id/next_button_item_text")
    public WebElement getStartedBtnText;
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

    public void verifyAndClickOnGetStartedbutton(){
        // Assert.assertEquals(getStartedBtnText.getText(), "Get Started");
        getStartedBtn.click();
    }
}
