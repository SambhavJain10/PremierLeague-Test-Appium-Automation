package org.sambhavjain.testScripts.plWelcome;

import org.sambhavjain.pageObjects.welcome.BaseWelcomePage;
import org.sambhavjain.testScripts.baseTest.BaseTest;
import org.testng.annotations.Test;

public class WelcomePageTest extends BaseTest {

    BaseWelcomePage baseWelcomePage=new BaseWelcomePage();

    @Test
    public void asUserWouldLikeToVerifyWelcomeSection(){
        baseWelcomePage.initialization(driver);
        baseWelcomePage.validateWelcomeTitle();
        baseWelcomePage.validateWelcomeDescription();
    }
}
