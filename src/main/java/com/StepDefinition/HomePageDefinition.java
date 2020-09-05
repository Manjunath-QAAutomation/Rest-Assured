package com.StepDefinition;

import java.util.List;

import com.Main.Base;
import com.Pages.HomePage;
import com.Pages.LoginPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidElement;

public class HomePageDefinition extends Base {

	HomePage homePage;
	LoginPage loginpage;

	@When("^User clicks on Sign-In Button$")
	public void userClicksOnSignInButton() {
		homePage = new HomePage(driver);
		homePage.clickOnSignInBtn();    
	}

	@When("^User logged in using username, password and click signIn Button$")
	public void userLoggedInUsingUsernamePasswordAndClickSignInButton() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName(prop.getProperty("username"));
		loginpage.clickOnContinue();
		loginpage.enterpassword(prop.getProperty("password"));
		loginpage.clickOnSignIn();
	}

	@Then("^User should see that home page is displayed$")
	public void userShouldSeeThatHomePageIsDisplayed() {
		homePage = new HomePage(driver);
		homePage.verifyHomeIsDisplayed();
	}
	@When("^User searches for '(\\d+)-inch TV'$")
	public void user_searches_for_inch_TV(String tvDetail)  {
		homePage = new HomePage(driver);
		homePage.enterSearchDetail(tvDetail);
	}

	@When("^User click on one of the TV's displays except first and Last$")
	public void userClickOnOneOfTheTVDisplayesExceptFirstAndLast() {
		homePage = new HomePage(driver);
		homePage.selectSecondTvFromSearchResults();
	}

	@When("^User Add the Product to cart$")
	public void userAddTheProductToCart() {
		homePage = new HomePage(driver);
		homePage.clickOnAddToCardButton();
	}

}
