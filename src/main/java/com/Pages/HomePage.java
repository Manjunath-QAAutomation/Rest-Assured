package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.Main.Base;

public class HomePage extends Base {


	@FindBy(id ="com.amazon.mShop.android.shopping:id/gno_greeting_text_view")
	public static WebElement signInButton;

	@FindBy(id ="com.amazon.mShop.android.shopping:id/action_bar_home_logo")
	public static WebElement AmazonLogo;
	
	@FindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
	public static WebElement HomeSearch;
	
	@FindBy(id ="com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_text")
	public static WebElement SearchDropDown;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Results')]")
	public static WebElement ResultsCount;
	
	@FindBy(xpath = "android.widget.EditText:id/in.amazon.mShop.android.shopping:id/rs_search_src_text")
	public static WebElement searchBox;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Deliver')]")
	public static WebElement Devliver;
	
	@FindBy(id = "com.amazon.mShop.android.shopping:id/loc_ux_update_current_pin_code")
	public static WebElement useCurrentLocation;
	
	@FindBy(xpath = "//*[@text='Sign in for the best experience']")
	public static WebElement SigninForBestExperience;
	
	@FindBy(id =  "com.android.packageinstaller:id/permission_allow_button")
	public static WebElement AllowPermission;
	
	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id='in.amazon.mShop.android.shopping:id/iss_search_dropdown_item_suggestions']")
	public static List<WebElement> searchBoxResults;
	
	@FindBy(id = "//android.widget.TextView:id/in.amazon.mShop.android.shopping:id/item_title")
	public static WebElement saveSearchPopUp;
	
	@FindBy(xpath = "//android.widget.TextView:id/in.amazon.mShop.android.shopping:id/item_title")
	public static List<WebElement> tvResultsNameDescription;
	
	@FindBy(xpath = "//android.widget.TextView:id/in.amazon.mShop.android.shopping:id/item_price")
	public static List<WebElement> tvResultPrices;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"ADD TO CART\"]")
	public static WebElement addTocartBtn;

	public static WebElement getSignInButton() {
		return signInButton;
	}

	public static WebElement getSearchBox() {
		return searchBox;
	}

	public static List<WebElement> getSearchBoxResults() {
		return searchBoxResults;
	}

	public static WebElement getSaveSearchPopUp() {
		return saveSearchPopUp;
	}

	public static List<WebElement> getTvResultsNameDescription() {
		return tvResultsNameDescription;
	}

	public static List<WebElement> getTvResultPrices() {
		return tvResultPrices;
	}

	public static WebElement getAddTocartBtn() {
		return addTocartBtn;
	}

}
