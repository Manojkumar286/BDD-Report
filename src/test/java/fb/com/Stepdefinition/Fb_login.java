package fb.com.Stepdefinition;

import org.junit.Assert;

import PageObjectManager.PageObjectManager;
import fb.com.Baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Fb_login extends Baseclass {
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User Launch {string} Browser")
	public void user_launch_browser(String string) {
	    browserlaunch(string);
	    
	}
	@Given("User Navigate Url {string}")
	public void user_navigate_url(String string) {
	    get_url(string);
	    
	}
	@Given("User Verify Page Land On Login Page")
	public void user_verify_page_land_on_login_page() {
	    Assert.assertTrue(isdisplayed(pom.getLogin().getFb_Logo()));
	    
	}
	@Given("User Enter Valid Username {string}")
	public void user_enter_valid_username(String string) {
	    elementsendkeys(pom.getLogin().getUsername(), string);
	    
	}
	@Given("User Enter Valid Password {string}")
	public void user_enter_valid_password(String string) {
	    elementsendkeys(pom.getLogin().getPassword(), string);
	    
	}
	@Given("User Clicl Login Button")
	public void user_clicl_login_button() {
	    elementclick(pom.getLogin().getLofin_btn());
	    
	}
	@Then("User Verify Logedin Successfull")
	public void user_verify_logedin_successfull() {
	    
	    
	}

}
