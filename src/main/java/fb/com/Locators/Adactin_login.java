package fb.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.Baseclass.Baseclass;

public class Adactin_login extends Baseclass {
	public Adactin_login(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@class='logo']")
	private WebElement Adactin_logo;
	
	@FindBy(id = "username")
	private WebElement Adactin_Name;
	
	@FindBy(id = "password")
	private WebElement Adactin_Pass;
	
	@FindBy(id = "login")
	private WebElement Adactin_Click;
	
	@FindBy(xpath = "//div[@class='auth_error']")
	private WebElement Adactin_ErrorMsg;

	public WebElement getAdactin_logo() {
		return Adactin_logo;
	}

	public WebElement getAdactin_Name() {
		return Adactin_Name;
	}

	public WebElement getAdactin_Pass() {
		return Adactin_Pass;
	}

	public WebElement getAdactin_Click() {
		return Adactin_Click;
	}

	public WebElement getAdactin_ErrorMsg() {
		return Adactin_ErrorMsg;
	}
	
}
