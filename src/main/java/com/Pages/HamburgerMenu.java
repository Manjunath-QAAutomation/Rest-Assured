package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import com.Main.Base;


public class HamburgerMenu extends Base{

	
	@FindBy(xpath = "//android.widget.Button[@text='Skip sign in']")
	public static WebElement skipsigninbtn;
	
	@FindBy(id ="com.amazon.mShop.android.shopping:id/action_bar_burger_icon")
	public static WebElement hamburgerMenuBtn;
	
	@FindBy(id = "android.widget.LinearLayout:id/in.amazon.mShop.android.shopping:id/anp_drawer_item")
	public static WebElement settingtab;
	
	
	public static WebElement getSkipSigninBtn() {
		return skipsigninbtn;
	}
	
	public static WebElement getHamburgerMenuBtn() {
		return hamburgerMenuBtn;
	}

	public static WebElement getSettingtab() {
		return settingtab;
	}

	
	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for clicking on Hamburger menu
	 * @date : 04/09/2020
	 */
	public static void clickOnskipSigninbtn() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(getSkipSigninBtn()));
		if(getSkipSigninBtn().isDisplayed()){
		getSkipSigninBtn().click();
		Reporter.log("Skip sign in button clicked");
		}
	}
	
	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for clicking on Hamburger menu
	 * @date : 03/09/2020
	 */
	public static void clickOnhamburgerMenu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(getHamburgerMenuBtn()));
		if(getHamburgerMenuBtn().isDisplayed()){
		getHamburgerMenuBtn().click();
		Reporter.log("Menu Icon clicked");
		}
	}

}
