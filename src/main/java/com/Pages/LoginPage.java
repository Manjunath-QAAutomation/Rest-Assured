package com.Pages;


import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.Main.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	public LoginPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "android.widget.EditText:id/ap_email_login")
	private MobileElement usernameField;
	
	@AndroidFindBy(id = "android.widget.Button:id/continue")
	private MobileElement contiueButton;

	@AndroidFindBy(id = "android.widget.EditText:id/ap_password")
	private MobileElement passwordField;

	
	@AndroidFindBy(id = "android.widget.Button:id/signInSubmit")
	private MobileElement loginButton;


	@AndroidFindBy(xpath = "")
	private MobileElement error_Msg;

	public MobileElement getusernameField() {
		return usernameField;
	}


	public MobileElement getucontiueButton() {
		return contiueButton;
	}

	public MobileElement getpasswordField() {
		return passwordField;
	}

	public MobileElement getSubmit_btn() {
		return loginButton;
	}

	public MobileElement getError_Msg() {
		return error_Msg;
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is to verify whether the username text box is present
	 *      or not and then enter the username
	 * @param username used to enter in the username text box
	 * @date : 03/09/2020
	 */
	public void enterUserName(String uname) {
		try{
		getusernameField().isDisplayed();			
		getusernameField().sendKeys(uname);
		Reporter.log("Username is Entered", true);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for clicking on the signIn Button
	 * @date : 04/09/2019
	 */
	public void clickOnContinue() {
		getucontiueButton().click();
		Reporter.log("Click on Continue button", true);
	}
	
	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is to verify whether the password text box is present
	 *      or not and then enter the password
	 * @param password used to enter in the password text box
	 * @date : 03/09/2019
	 */
	public void enterpassword(String pwd) {
		try {
			getpasswordField().isDisplayed();
			getpasswordField().sendKeys(pwd);
			Reporter.log("Password is Entered", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for clicking on the signIn Button
	 * @date : 03/09/2019
	 */
	public void clickOnSignIn() {
		getSubmit_btn().click();
		Reporter.log("Click on SignIn button", true);
	}

}
