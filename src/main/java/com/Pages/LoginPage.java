package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import com.Main.Base;


public class LoginPage extends Base{

	
	@FindBy(xpath = "//android.widget.EditText[@index='1']")
	public static WebElement usernameField;
		
	@FindBy(xpath = "//android.widget.Button[@text='Continue']")
	public static WebElement contiueButton;

	@FindBy(xpath = "//android.widget.EditText[@text='Amazon password']")
	public static WebElement passwordField;

	@FindBy(xpath = "//android.widget.Button[@text='Login']")
	public static WebElement loginButton;


	public static WebElement getusernameField() {
		return usernameField;
	}


	public static WebElement getucontiueButton() {
		return contiueButton;
	}

	public static WebElement getpasswordField() {
		return passwordField;
	}

	public static WebElement getSubmit_btn() {
		return loginButton;
	}


	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for clicking on the signIn Button
	 * @date : 04/09/2019
	 */
	public static void clickOnContinue() {
		getucontiueButton().click();
		Reporter.log("Click on Continue button", true);
	}
	
}
