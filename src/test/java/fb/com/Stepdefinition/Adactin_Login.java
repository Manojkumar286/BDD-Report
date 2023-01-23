package fb.com.Stepdefinition;

import org.junit.Assert;

import PageObjectManager.PageObjectManager;
import fb.com.Baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Adactin_Login extends Baseclass {
	PageObjectManager pom = new PageObjectManager(driver);
	@Given("User Launch {string} browser")
	public void user_launch_browser(String string) {
	    browserlaunch(string);
	    
	}
	@Given("User navigate Url {string}")
	public void user_navigate_url(String string) {
	    get_url(string);
	    
	}
	@Given("Verify Land On Login Page")
	public void verify_land_on_login_page() {
	    Assert.assertTrue(isdisplayed(pom.getAdactin_login().getAdactin_logo()));
	    
	}
	@Given("Enter User Name {string}")
	public void enter_user_name(String string) {
	    elementsendkeys(pom.getAdactin_login().getAdactin_Name(),string);
	    
	}
	@Given("Enter User Password {string}")
	public void enter_user_password(String string) {
		elementsendkeys(pom.getAdactin_login().getAdactin_Pass(),string);
	    
	}
	
	@Given("User Click Login Button")
	public void user_click_login_button() {
	    elementclick(pom.getAdactin_login().getAdactin_Click());
	    
	}
	@Then("User Verify Error Message {string}")
	public void user_verify_error_message(String string) {	    
	   Assert.assertEquals(string,pom.getAdactin_login().getAdactin_ErrorMsg().getText());
	}

}
