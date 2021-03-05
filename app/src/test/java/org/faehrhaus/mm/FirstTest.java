package org.faehrhaus.mm;

import net.bytebuddy.pool.TypePool;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class FirstTest {
    AppiumDriver driver;

    @Before
    public void setup() {
        DesiredCapabilities  cap = new DesiredCapabilities();
        cap.setCapability("platformName","Android");
        //cap.setCapability("platformVersion", "11.0.0");
        cap.setCapability("platformVersion", "8.0.0");
        cap.setCapability("appPackage","org.faehrhaus.mm");
        cap.setCapability("appActivity","org.faehrhaus.mm.MainActivity");
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }

    @Test
    public void testFaehrhausAppRunThroughPortrait(){
        try {
            driver.rotate(ScreenOrientation.PORTRAIT);
            MobileElement el1 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_MP_Next");
            el1.click();
            MobileElement el2 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_CP_next");
            el2.click();
            MobileElement el3 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_SP1_Next");
            el3.click();
            MobileElement el4 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_SP2_next");
            el4.click();
            MobileElement el5 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_AP_toMP");
            el5.click();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    @Test
    public void testFaehrhausAppRunThroughLandscape(){
        try {
            driver.rotate(ScreenOrientation.LANDSCAPE);
            MobileElement el1 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_MP_Next");
            el1.click();
            MobileElement el2 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_CP_next");
            el2.click();
            MobileElement el3 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_SP1_Next");
            el3.click();
            MobileElement el4 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_SP2_next");
            el4.click();
            MobileElement el5 = (MobileElement) driver.findElementById("org.faehrhaus.mm:id/btn_AP_toMP");
            el5.click();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }


    @After
    public void terminateAllTests()
    {
        driver.quit();
    }


}
