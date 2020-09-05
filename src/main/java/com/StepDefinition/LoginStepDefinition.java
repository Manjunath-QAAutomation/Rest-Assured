package com.StepDefinition;

import java.io.IOException;

import com.Main.Base;
import com.Pages.HamburgerMenu;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends Base{
	
	HamburgerMenu hamburger;

	@Given("^user launches the app$")
	public void userLaunchesTheapp() throws IOException, InterruptedException  {
		Base.Initialise();
		hamburger = new HamburgerMenu(driver);
		hamburger.clickOnskipSigninbtn();
	}

	
	
	@When("^User clicks on hamburger Menu$")
	public void userClicksOnhamburgerMenuICon() throws InterruptedException  {	
		hamburger = new HamburgerMenu(driver);
		hamburger.clickOnhamburgerMenu();
	}

	@When("^Hamburger Menu is Displayed$")
	public void hamburgerMenuICon_Displayed() throws InterruptedException  {	
		hamburger = new HamburgerMenu(driver);	
		hamburger.getHamburgerMenuBtn().isDisplayed();
		
	}

	
	@When("^User moves to setting submenu$")
	public void userMovesToSettingSubmenu(){
		hamburger = new HamburgerMenu(driver);
		hamburger.clickOnSettingSubMenu();
	}

	@When("^User select the country as 'Australia'$")
	public void userSelectTheCountryAsAustralia()  {
		hamburger = new HamburgerMenu(driver);
		//hamburger.verifyCountryName();
		hamburger.clickOnCountySelectionLink();
		hamburger.selectTheCountry();
	}

	@When("^User navigates back to Home Page$")
	public void userNavigatesBackToHomePage()  {
		hamburger = new HamburgerMenu(driver);
		hamburger.getNavigateBack().click();
		hamburger.getNavigateBack().click();
	}

}
