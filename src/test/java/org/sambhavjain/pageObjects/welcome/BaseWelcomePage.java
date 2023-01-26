package org.sambhavjain.pageObjects.welcome;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.sambhavjain.utils.AndroidActions;
import org.testng.Assert;

public class BaseWelcomePage extends AndroidActions {

    AndroidDriver driver;
    public BaseWelcomePage(AndroidDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this) ;
    }

    @AndroidFindBy (id="com.pl.premierleague:id/logo")
    private WebElement welcomeLogoElement;

    @AndroidFindBy(id="com.pl.premierleague:id/title")
    private WebElement welcomeTitleElement;

    @AndroidFindBy  (id="com.pl.premierleague:id/description")
    private WebElement welcomeDescElement;

    @AndroidFindBy (id="com.pl.premierleague:id/next_button_item_text")
    private WebElement getStartedBtnText;
    @AndroidFindBy  (id="com.pl.premierleague:id/next_button")
    private WebElement getStartedBtn;

    @AndroidFindBy  (id="com.pl.premierleague:id/have_an_account")
    private WebElement alreadyActElement;

    @AndroidFindBy  (id="com.pl.premierleague:id/login_button")
    private WebElement loginElement;

    public void initialization(AndroidDriver driver){
        PageFactory.initElements(driver, this)  ;

    }
    public void validateWelcomeTitle(){

        Assert.assertEquals(welcomeTitleElement.getText(), "Welcome!");

    }

    public void validateWelcomeDescription(){


        Assert.assertEquals(welcomeDescElement.getText(), "Help us tailor your experience by answering a few quick and easy questions");

    }

    public void verifyAndClickOnGetStartedbutton(AndroidDriver driver){
        waitForElementToAppear(getStartedBtn, driver );
       // Assert.assertEquals(getStartedBtnText.getText(), "Get Started");
        getStartedBtn.click();
    }
}
