package com.CommonFunctions;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.Main.Base;

import io.appium.java_client.android.AndroidElement;

public class AppiumUtility extends Base {
	
	/**
	 * @author Manjunath.Karoshi
	 * @description: This method for scrolling to target element with text
	 * @date : 03/09/2020
	 */
	public static void scrollToText(String text) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
	}
	
	/**
	 * @author Manjunath.Karoshi
	 * @description: This method for clicking the element using JavascriptExecutor interface
	 * @date : 03/09/2020
	 */
	public static void javaScriptClick(AndroidElement element) throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Reporter.log("Javascript click is succesfully performed");
	}


}
