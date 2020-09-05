package com.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base {
	
	public static Properties prop;
	public static String userName = "manjunathkaroshi3";
	  public static String accessKey = "VoyUW4ryDL6NZze1Djgb";
	  public static AndroidDriver<AndroidElement>driver;
	  
	/**
	 * @author Manjunath.Karoshi
	 * @description:Base Class Constructor to load the properties file
	 * @date : 03/09/2020
	 */
	public Base() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\Resources\\Application.properties");
			prop.load(fis);
			Reporter.log("Properties files loaded");
			
		    
		} catch (IOException e) {
			e.getMessage();
		}
	}

	/**
	 * @author Manjunath.Karoshi
	 * @description: This method helps in Initializing the AndroidDriver
	 * @date : 03/09/2020
	 */
	public static void Initialise() throws IOException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "Google Pixel 3");
	    caps.setCapability("os_version", "9.0");
	    caps.setCapability("project", "Wipro Amazon");
	    caps.setCapability("build", "Amazon build");
	    caps.setCapability("name", "Wipro Amazon Project");
	    caps.setCapability("app", "bs://5faf9b9e7a80abcaa7465963ecbf395b8626ffa7");

	    driver = new AndroidDriver<AndroidElement>(new URL("https://manjunathkaroshi3:VoyUW4ryDL6NZze1Djgb@hub-cloud.browserstack.com/wd/hub"), caps);
   
       Thread.sleep(10000);
       
	}

}
