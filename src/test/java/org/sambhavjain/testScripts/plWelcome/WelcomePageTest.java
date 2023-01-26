package org.sambhavjain.testScripts.plWelcome;

import org.sambhavjain.pageObjects.welcome.BaseWelcomePage;
import org.sambhavjain.testScripts.baseTest.BaseTest;
import org.testng.annotations.Test;

public class WelcomePageTest extends BaseTest {

    BaseWelcomePage baseWelcomePage=new BaseWelcomePage(driver);

    @Test
    public void asUserWouldLikeToVerifyWelcomeSection(){
        baseWelcomePage.validateWelcomeTitle();
        baseWelcomePage.validateWelcomeDescription();
    }
    @Test
    public void asUserWouldLikeToValidateGetStartedButton(){
        baseWelcomePage.verifyAndClickOnGetStartedbutton(driver);
    }
}
