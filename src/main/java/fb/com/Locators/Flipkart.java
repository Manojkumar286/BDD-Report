package fb.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.Baseclass.Baseclass;

public class Flipkart extends Baseclass{
 public Flipkart(WebDriver xdriver) {
	 this.driver=xdriver;
	 PageFactory.initElements(driver,this);
 }
 @FindBy(xpath = "//button[text()='✕']")
 private WebElement Login_page;
 
 @FindBy(xpath = "//div[text()='Mobiles & Tablets']")
 private WebElement Mobile;
 
 @FindBy(xpath = "//div[@class='_1kidPb']//child::span[text()='Electronics']")
 private WebElement Electronics;
 
 @FindBy(xpath = "//a[text()='Mi']")
 private WebElement MI;
 
 @FindBy(xpath = "//h1[text()='Mi Mobiles']")
 private WebElement MI_Page;
 
 @FindBy(xpath = "(//select[@class='_2YxCDZ'])[2]")
 private WebElement Fix_Price;
 
 @FindBy(name = "q")
 private WebElement Search_MI;
 
 @FindBy(xpath = "//div[text()='REDMI Note 10S (Frost White, 64 GB)']")
 private WebElement First_product;
 
 @FindBy(id = "pincodeInputId")
 private WebElement Enter_pincode;
 
 @FindBy(xpath = "//span[text()='View Details']")
 private WebElement click_view;
 
 @FindBy(xpath = "(//button[text()='✕'])[1]")
 private WebElement Close_view;
 
 @FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
 private WebElement Addtocart;

public WebElement getLogin_page() {
	return Login_page;
}

public WebElement getMobile() {
	return Mobile;
}

public WebElement getElectronics() {
	return Electronics;
}

public WebElement getMI() {
	return MI;
}

public WebElement getMI_Page() {
	return MI_Page;
}

public WebElement getFix_Price() {
	return Fix_Price;
}

public WebElement getSearch_MI() {
	return Search_MI;
}

public WebElement getFirst_product() {
	return First_product;
}

public WebElement getEnter_pincode() {
	return Enter_pincode;
}

public WebElement getClick_view() {
	return click_view;
}

public WebElement getClose_view() {
	return Close_view;
}

public WebElement getAddtocart() {
	return Addtocart;
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
