package com.Pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePage {

	public static int TvPrice;
	public static String TvDescription;

	public HomePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//@AndroidFindBy(id = "android.widget.Button:id/signInSubmit")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
	private MobileElement signInButton;
	
	@AndroidFindBy(xpath = "android.widget.EditText:id/in.amazon.mShop.android.shopping:id/rs_search_src_text")
	private MobileElement searchBox;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.amazon.mShop.android.shopping:id/iss_search_dropdown_item_suggestions']")
	private List<MobileElement> searchBoxResults;
	
	@AndroidFindBy(id = "//android.widget.TextView:id/in.amazon.mShop.android.shopping:id/item_title")
	private MobileElement saveSearchPopUp;
	
	@AndroidFindBy(xpath = "//android.widget.TextView:id/in.amazon.mShop.android.shopping:id/item_title")
	private List<MobileElement> tvResultsNameDescription;
	
	@AndroidFindBy(xpath = "//android.widget.TextView:id/in.amazon.mShop.android.shopping:id/item_price")
	private List<MobileElement> tvResultPrices;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"ADD TO CART\"]")
	private MobileElement addTocartBtn;

	public MobileElement getSignInButton() {
		return signInButton;
	}

	public MobileElement getSearchBox() {
		return searchBox;
	}

	public List<MobileElement> getSearchBoxResults() {
		return searchBoxResults;
	}

	public MobileElement getSaveSearchPopUp() {
		return saveSearchPopUp;
	}

	public List<MobileElement> getTvResultsNameDescription() {
		return tvResultsNameDescription;
	}

	public List<MobileElement> getTvResultPrices() {
		return tvResultPrices;
	}

	public MobileElement getAddTocartBtn() {
		return addTocartBtn;
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for checking the display of SignIn Button and
	 *              then click on SignIn Button
	 * @date : 03/09/2020
	 */
	public void clickOnSignInBtn() {
		getSignInButton().isDisplayed();
		getSignInButton().click();
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is used to verify search box is displaying
	 * @date : 03/09/2020
	 */
	public void verifyHomeIsDisplayed() {
		getSearchBox().isDisplayed();
		Reporter.log("Search box is displayed");
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for entering the search detail in the search box
	 * @date : 03/09/2020
	 */
	public void enterSearchDetail(String searchDetail) {
		getSearchBox().isDisplayed();
		getSearchBox().sendKeys(searchDetail);
		Reporter.log("Search details entered");
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is used to select the TV list details from the suggestions           
	 * @date : 03/09/2020
	 */
	public void selectTVFromList() {
		searchBoxResults.get(1).isDisplayed();
		searchBoxResults.get(1).click();
		Reporter.log("Clicked on 2nd Tv", true);
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for verifying the pop-up presennt and
	 *              then click on pop-up
	 * @date : 03/09/2020
	 */
	public void clickOnSaVePopUp() {
		getSaveSearchPopUp().isDisplayed();
		getSaveSearchPopUp().click();
		Reporter.log("Click on pop-up");
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for selecting the 2nd TV from the results
	 *              displayed click
	 * @date : 03/09/2020
	 */
	public void selectSecondTvFromSearchResults() {
		getSearchBoxResults().get(1).isDisplayed();
		getSearchBoxResults().get(1).click();
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is used to store the Product details
	 * @date : 03/09/2020
	 */
	public void getAllTheProductDetail() {
		String prodDetails=getTvResultPrices().get(1).getText();
		TvPrice = Integer.parseInt(prodDetails);
		TvDescription = getTvResultsNameDescription().get(1).getText();
		Reporter.log("Product Details:" + "Description : " + TvDescription + "\n and the Price is :"
				+ TvPrice);
	}

	/**
	 * @author Manjunath.Karoshi
	 * @Description : This method is for adding the product to cart page
	 * @date : 03/09/2020
	 */
	public void clickOnAddToCardButton() {
		getAddTocartBtn().isDisplayed();
		getAddTocartBtn().click();
		Reporter.log("Product is added to the cart");
	}
}
