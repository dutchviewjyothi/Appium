package com.company;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class login extends base {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver driver = Capabilities(); //creating driver object
        //Login
        driver.findElementById("login_activity_emailid_editText").click();
        driver.findElementById("login_activity_emailid_editText").sendKeys("jyothi@dutchview.com");
        driver.hideKeyboard();
        driver.findElementById("login_activity_password_editText").click();
        driver.findElementById("login_activity_password_editText").sendKeys("12345678");
        driver.hideKeyboard();
        driver.findElementById("login_activity_login_Button").click();
        driver.hideKeyboard();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementById("project_action_status_logout").click();
        driver.hideKeyboard();
        //logging out
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementById("android:id/button2").click();
        driver.hideKeyboard();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementById("login_activity_emailid_editText").click();
        driver.findElementById("login_activity_emailid_editText").sendKeys("jothi@dutchview.com");
        driver.hideKeyboard();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementById("login_activity_password_editText").click();
        driver.findElementById("login_activity_password_editText").sendKeys("123456789");
        driver.findElementById("login_activity_login_Button").click();
        //driver.hideKeyboard();







    }




}



