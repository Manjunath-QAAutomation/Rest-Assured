package com.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = { "pretty", "html:target/cucumber",
		"json:target/cucumber.json" }, features = "Features", glue = { "com.StepDefinition" }, tags = "~@ignore", monochrome = true)
public class RunnerClass extends AbstractTestNGCucumberTests{

}
