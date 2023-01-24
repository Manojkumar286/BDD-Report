package fb.com.Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\fb\\com\\Features",glue="fb.com.Stepdefinition",
tags = "@Flipkart",dryRun = false,stepNotifications = false,plugin = {"html:target\\report\\Flipkart.html",
		"json:target\\report\\Flipkart.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner {
	
	
}
