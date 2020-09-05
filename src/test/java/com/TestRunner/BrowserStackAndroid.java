package com.TestRunner;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class BrowserStackAndroid {
  
  public static String userName = "manjunathkaroshi3";
  public static String accessKey = "VoyUW4ryDL6NZze1Djgb";

  public static void main(String args[]) throws MalformedURLException, InterruptedException {
    DesiredCapabilities caps = new DesiredCapabilities();

    caps.setCapability("device", "Google Pixel 3");
    caps.setCapability("os_version", "9.0");
    caps.setCapability("project", "My First Project");
    caps.setCapability("build", "My First Build");
    caps.setCapability("name", "Bstack-[Java] Sample Test");
    caps.setCapability("app", "bs://5faf9b9e7a80abcaa7465963ecbf395b8626ffa7");

    AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

    System.out.println("App launched");
    Thread.sleep(5000);
/*    List<AndroidElement>list1=driver.findElementsById("android.widget.Button:id/in.amazon.mShop.android.shopping:id/sign_in_button");
    System.out.println(list1.size());
    List<AndroidElement>list2=driver.findElementsByXPath("//android.widget.Button[@text='Already a customer?Sign in']");
    System.out.println(list2.size());
    List<AndroidElement>list3=driver.findElementsById("android.widget.Button:id/sign_in_button");
    System.out.println(list3.size());*/
    
    List<AndroidElement>list5=driver.findElementsByXPath("//android.widget.Button[@text='Skip sign in']");
    System.out.println(list5.size());
    
    driver.findElementByXPath("//android.widget.Button[@text='Skip sign in']").click();
    Thread.sleep(5000);
    driver.quit();
  }
}
