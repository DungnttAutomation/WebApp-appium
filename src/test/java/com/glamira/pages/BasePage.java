package com.glamira.pages;

import com.glamira.config.AppiumConfig;
import com.glamira.config.MobilePlatform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.glamira.config.AppiumConfig.getDriver;


public class BasePage {
    public static final AppiumDriver<MobileElement> driver = getDriver();
//    public static final IOSDriver driver ;
    static final MobilePlatform OS = AppiumConfig.getOS();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    //    WebDriverWait waitIOS = new WebDriverWait(driver, 5);

    public void waitAboutSeconds(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
