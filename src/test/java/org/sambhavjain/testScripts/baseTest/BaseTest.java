package org.sambhavjain.testScripts.baseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
/*
import java.net.MalformedURLException;
*/
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void configureAppium() throws MalformedURLException {


      /*  service = new AppiumServiceBuilder().withAppiumJS(new File(
          "C:/Users/sambh/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
            .withIPAddress("127.0.0.1").usingPort(4273).build();

        service.start();*/

        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Pixel_2_XL");
        options.setApp("D:/Automation/Appium/GitHubRepos/PremierLeague-Test-Appium-Automation/src/resources/premier-league-v2-7-4-3470.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
