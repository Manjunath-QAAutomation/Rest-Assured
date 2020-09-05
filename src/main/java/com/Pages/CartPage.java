package com.Pages;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class CartPage {
	
	public CartPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Proceed to Buy']")
	private MobileElement cartPageHeader;
	
	@AndroidFindBy(className = "android.view.View[3]")
	private MobileElement productsPrice;
	
	@AndroidFindBy(className = "android.view.View[1]")
	private MobileElement ProdcutsDescription;

	public MobileElement getCartPageHeader() {
		return cartPageHeader;
	}

	public MobileElement getProductsPrice() {
		return productsPrice;
	}

	public MobileElement getProdcutsDescription() {
		return ProdcutsDescription;
	}

	/**
	 * @author Manjunath.Karoshi
	 * @description: This method is for checking whether Cart Page is displaying or not
	 * @date : 04/09/2020
	 */
	public void verifyCartPageIsDisplaying() {
		getCartPageHeader().isDisplayed();
		Reporter.log("Cart Page is Displayed");
	}

	/**
	 * @author Manjunath.Karoshi
	 * @description: This method is for verifying the product details on the Cart page
	 * @date : 04/09/2020
	 */
	public void verifyTheproductDetail() {
		int TVPriceCart = Integer.parseInt(getProductsPrice().getText());
		String TVDescCart = getProdcutsDescription().getText();
		Assert.assertEquals(TVPriceCart, HomePage.TvPrice);
		Assert.assertEquals(TVDescCart, HomePage.TvDescription);
		Reporter.log("Product details are verified in the cart page");
	}

}
