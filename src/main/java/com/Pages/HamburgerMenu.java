package com.Pages;



import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.CommonFunctions.AppiumUtility;
import com.Main.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HamburgerMenu{

	public HamburgerMenu(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Skip sign in']")
	private MobileElement skipsigninbtn;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"in.amazon.mShop.android.shopping:id/action_bar_burger_icon\"]")
	//@AndroidFindBy(id ="in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
	private MobileElement hamburgerMenuBtn;
	
	@AndroidFindBy(id = "android.widget.LinearLayout:id/in.amazon.mShop.android.shopping:id/anp_drawer_item")
	private MobileElement settingtab;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Country']")
	private MobileElement countrySelectTag;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Australia (English)\"]")
	private MobileElement countryName;
	
	
	@AndroidFindBy(accessibility = "Navigate up")
	private MobileElement navigateBack;

	public MobileElement getSkipSigninBtn() {
		return skipsigninbtn;
	}
	
	public MobileElement getHamburgerMenuBtn() {
		return hamburgerMenuBtn;
	}

	public MobileElement getSettingtab() {
		return settingtab;
	}

	public MobileElement getCountrySelectTag() {
		return countrySelectTag;
	}

	public MobileElement getCountryName() {
		return countryName;
	}

	public MobileElement getNavigateBack() {
		return navigateBack;
	}

	
	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for clicking on Hamburger menu
	 * @date : 04/09/2020
	 */
	public void clickOnskipSigninbtn() throws InterruptedException {
		Thread.sleep(15000);
		
		getSkipSigninBtn().isDisplayed();
		getSkipSigninBtn().click();
		Reporter.log("Skip sign in button clicked");
	}
	
	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for clicking on Hamburger menu
	 * @date : 03/09/2020
	 */
	public void clickOnhamburgerMenu() throws InterruptedException {
		Thread.sleep(15000);
		getHamburgerMenuBtn().isDisplayed();
		getHamburgerMenuBtn().click();
		Reporter.log("Menu Icon clicked");
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is used for scrolling up to Settings submenu and
	 *               then clicking on settings
	 * @date : 03/09/2020
	 */
	public void scrollUptoSettingView() {
		AppiumUtility.scrollToText("setting");
		getSettingtab().click();
		Reporter.log("Scrolled upto settings submenu");
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is used for clicking on settings submenu
	 * @date : 03/09/2020
	 */
	public void clickOnSettingSubMenu() {
		getSettingtab().click();
		Reporter.log("Clicked on Setting submenu Icon");
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is used to verify the country name
	 * @date : 03/09/2020
	 */
	public void verifyCountryName() {
		String country = getCountryName().getText();
		Reporter.log("Default Selected country is : " + country);
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for clicking on country
	 * @date : 03/09/2020
	 */
	public void clickOnCountySelectionLink() {
		getCountrySelectTag().isDisplayed();
		getCountrySelectTag().click();
	}

	
	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for selecting the desired country
	 * @date : 03/09/2020
	 */
	public void selectTheCountry() {
		getCountryName().isDisplayed();
		getCountryName().click();
		Reporter.log("Desired Country is selected");
	}
	
	
}
