package com.Main;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.Pages.CartPage;
import com.Pages.HamburgerMenu;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.ProductPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Base {

	public static Properties prop;
	public static WebDriverWait wait;
	public static String userName = "manjunathkaroshi3";
	public static String accessKey = "VoyUW4ryDL6NZze1Djgb";
	public static AppiumDriver<MobileElement> driver;

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

		driver = new AndroidDriver<MobileElement>(
				new URL("https://manjunathkaroshi3:VoyUW4ryDL6NZze1Djgb@hub-cloud.browserstack.com/wd/hub"), caps);

		wait = new WebDriverWait(driver, 30);

		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, HamburgerMenu.class);
		PageFactory.initElements(driver, ProductPage.class);
		PageFactory.initElements(driver, CartPage.class);

	}

}
