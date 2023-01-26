package org.sambhavjain.pageObjects.favouriteTeam;

import io.appium.java_client.FindsByAndroidUIAutomator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.sambhavjain.pageObjects.basePage.BasePage;


public class BaseFavouriteTeamPage extends BasePage {

    @FindBy(xpath = "")
    WebElement favTeamElement;


    public void scrollAndSelectTeam(){

       /* driver.findElement(FindsByAndroidUIAutomator("new UiScrollable(new UiSelector())." +
                "scrollIntoView(text(\"Manchaster United\"));"));*/
    }
}

