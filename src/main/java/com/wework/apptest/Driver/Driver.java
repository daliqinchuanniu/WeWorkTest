package com.wework.apptest.Driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    public AndroidDriver androidDriver;

    static Driver driver;
    public static Driver getInstance(){
        if (driver == null){
            driver = new Driver();
        }
        return driver;
    }
    public void start(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("deviceName","M7BBB18A24151568");
        caps.setCapability("appPackage","com.tencent.wework");
        caps.setCapability("appActivity",".launch.LaunchSplashActivity");
        caps.setCapability("automationName","uiautomator2");
        caps.setCapability("noReset",true);
        caps.setCapability("dontStopAppOnReset",true);
        caps.setCapability("unicodeKeyboard",true);
        caps.setCapability("resetKeyboard",true);
        caps.setCapability("autoGrantPermissions",true);


        try {
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
            androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public WebElement find(By by){
        return androidDriver.findElement(by);
    }
}
