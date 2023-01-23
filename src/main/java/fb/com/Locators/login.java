package fb.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.Baseclass.Baseclass;

public class login extends Baseclass {

	public  login(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "[alt='Facebook']")
	private WebElement Fb_Logo;

	@FindBy(id = "email")
	private WebElement Username;
	
	@FindBy(id = "pass")
	private WebElement Password;
	
	@FindBy(name = "login")
	private WebElement Lofin_btn;

	public WebElement getFb_Logo() {
		return Fb_Logo;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLofin_btn() {
		return Lofin_btn;
	}
	
	
}
