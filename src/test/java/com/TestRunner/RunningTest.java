package com.TestRunner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, features = "Features", glue = { "com.StepDefinition" }, monochrome = true)
public class RunningTest extends AbstractTestNGCucumberTests{

	@BeforeClass
	public static void setup() {
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	    extentProperties.setReportPath("target/cucumber-reports/"+timeStamp.replace(":","_").replace(".","_")+".html");
	}

	@AfterClass
	public static void writeExtentReport() {
		 
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/target/extent-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    
	}
	
}
