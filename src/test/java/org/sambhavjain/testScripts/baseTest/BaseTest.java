package org.sambhavjain.testScripts.baseTest;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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

    @BeforeMethod
    public void configureAppium() throws MalformedURLException {


      /*  service = new AppiumServiceBuilder().withAppiumJS(new File(
          "C:/Users/sambh/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
            .withIPAddress("127.0.0.1").usingPort(4273).build();

        service.start();*/

       /* UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Pixel_2_XL");
        options.setApp("D:/Automation/Appium/GitHubRepos/PremierLeague-Test-Appium-Automation/src/resources/premier-league-v2-7-4-3470.apk");*/

   /*     driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "sambhavjain_ORPqZ4");
        caps.setCapability("browserstack.key", "QdzU9CdpqhsYVdPhgyoj");

        // Set URL of the application under test
        caps.setCapability("app", "bs://e9bba8b4183e10576f191c50daac54bd615e5094");

        // Specify device and os_version for testing
        caps.setCapability("os_version", "10.0");
        caps.setCapability("device", "OnePlus 7T");
        caps.setCapability("browserstack.debug", "true");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
         driver = new AndroidDriver (
                new URL("http://hub.browserstack.com/wd/hub"), caps);
    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }
}
