package org.sambhavjain.pageObjects.favouriteTeam;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.sambhavjain.pageObjects.basePage.BasePage;
import org.sambhavjain.utils.AndroidActions;


public class BaseFavouriteTeamPage extends AndroidActions {

    @FindBy(xpath = "")
    WebElement favTeamElement;

    public BaseFavouriteTeamPage(AndroidDriver driver) {
        super(driver);
    }


    public void scrollAndSelectTeam(){

       /* driver.findElement(FindsByAndroidUIAutomator("new UiScrollable(new UiSelector())." +
                "scrollIntoView(text(\"Manchaster United\"));"));*/
    }
}

