package com.company;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class base {

    public static AndroidDriver Capabilities() throws MalformedURLException, InterruptedException {
        //file creation to get absolute path
        File f = new File("src"); // calling src folder
        File fs = new File(f,"EDApk.apk"); // calling the apk

        //Creating Desired Capabilities
        DesiredCapabilities cap = new DesiredCapabilities(); //Create object for DesiredCapabilities class
        cap.setCapability("DeviceName","Test1"); // Setting the Emulator name
        cap.setCapability("AutomationName","uiautomator2");
        cap.setCapability("appPackage","com.edcontrol.edcontrols.login");
        cap.setCapability("appActivity","com.edcontrol.edcontrols.SplashActivity");
        cap.setCapability("autoGrantPermissions", "true"); // To allow all the permission
        //cap.setCapability("udid","ce031713dbe850480d");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","9");
        cap.setCapability("newCommandTimeout", "45000");
        cap.setCapability("app",fs.getAbsolutePath());  //Setting the app path
        AndroidDriver driver  = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap); //setting the port
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;

    }
}
