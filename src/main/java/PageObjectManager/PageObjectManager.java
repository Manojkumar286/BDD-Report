package PageObjectManager;

import org.openqa.selenium.WebDriver;

import fb.com.Baseclass.Baseclass;
import fb.com.Locators.Adactin_login;
import fb.com.Locators.Flipkart;
import fb.com.Locators.login;

public class PageObjectManager extends Baseclass{
	
	public PageObjectManager(WebDriver xdriver) {
		this.driver=xdriver;
	}
	private login login;

	public login getLogin() {
		if(login==null) {
			login=new login(driver);
		}
		return login;
	}
	
	private Adactin_login adactin_login;

	public Adactin_login getAdactin_login() {
		if (adactin_login==null) {
			adactin_login=new Adactin_login(driver);
		}
		return adactin_login;
	}
	
	private Flipkart flipkart;

	public Flipkart getFlipkart() {
		if (flipkart==null) {
			flipkart=new Flipkart(driver);
		}
		return flipkart;
	}
	
	
}
