package com.CommonFunctions;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Main.Base;

public class CustomListener implements ITestListener {

	/**
	 * @author Manjunath.Karoshi
	 * @description: This Method is used to take the screenshot of failed test case
	 * @param ItestResuit
	 * @date : 03/09/2020
	 */
	public void onTestFailure(ITestResult result) {
		File scrFile = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(scrFile, new File(System.getProperty("user.dir") + "\\" + result.getName() + ".png"));
			Reporter.log("Take screen shot");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author Manjunath.Karoshi
	 * @description: This method is called on the start of any Test
	 * @param ItestResuit
	 * @date : 03/09/2020
	 */
	public void onTestStart(ITestResult result) {

	}

	/**
	 * @author Manjunath.Karoshi
	 * @description: This Method is used to take the screenshot of passed test case
	 * @param ItestResuit
	 * @date : 03/09/2020
	 */
	public void onTestSuccess(ITestResult result) {
		File scrFile = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(scrFile, new File(System.getProperty("user.dir") + "\\" + result.getName() + ".png"));
			Reporter.log("Take screen shot");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author Manjunath.Karoshi
	 * @description: This Method is for printing skipped test case
	 * @param ItestResuit
	 * @date : 03/09/2020
	 */
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName() + " is Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	/**
	 * @author Manjunath.Karoshi
	 * @description: This method is Invoked after the test class is instantiated and
	 *               before any configuration method is called
	 * @param ITestContext class defines a test context which contains all the
	 *                     information for a given test run
	 * @date : 03/09/2020
	 */
	public void onStart(ITestContext context) {
		Reporter.log(context.getName() + " is Started");
	}

	/**
	 * @author Manjunath.Karoshi
	 * @description: This method is called on the finish of any Test and it will
	 *               take screenshot of that Test with method name and will save in
	 *               project folder
	 * @param ITestContext class defines a test context which contains all the
	 *                     information for a given test run
	 * @date : 03/09/2020
	 */
	public void onFinish(ITestContext context) {
		File scrFile = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(scrFile, new File(System.getProperty("user.dir") + "\\" + context.getName() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
			Reporter.log("Fail to take screen shot");
		}
	}

}
