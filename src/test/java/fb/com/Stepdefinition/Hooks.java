package fb.com.Stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import fb.com.Baseclass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass {
	@Before
	public void BeforeHooks() {
		System.out.println("I Am Before Hooks");
	}
	
	@After
	public void AfterHooks(Scenario scenario) {
		TakesScreenshot ts =(TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs,"image/png","Screenshot");
		quit();
	}
}
