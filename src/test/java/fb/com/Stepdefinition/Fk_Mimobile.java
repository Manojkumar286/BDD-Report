package fb.com.Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageObjectManager.PageObjectManager;
import fb.com.Baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Fk_Mimobile extends Baseclass {
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User Close The Login Model Screen")
	public void user_close_the_login_model_screen() {
		elementclick(pom.getFlipkart().getLogin_page());
	}

	@Given("User Click The Mobile Option")
	public void user_click_the_mobile_option() {
		elementclick(pom.getFlipkart().getMobile());
	}

	@Given("User Touch The Electronics")
	public void user_touch_the_electronics() {
		mousehover(pom.getFlipkart().getElectronics());
	}

	@Given("User Click The MI Option")
	public void user_click_the_mi_option() {
		elementclick(pom.getFlipkart().getMI());

	}

	@Given("User Verify Land On MI Mobile Page")
	public void user_verify_land_on_mi_mobile_page() {
		Assert.assertTrue(isdisplayed(pom.getFlipkart().getMI_Page()));
	}

	@Given("User Fix The Max Price")
	public void user_fix_the_max_price() {
		dropdown(pom.getFlipkart().getFix_Price(), "Value", "20000");
	}

	@Given("User Search For MI Mobile Products")
	public void user_search_for_mi_mobile_products() {
		elementsendkeys(pom.getFlipkart().getSearch_MI(), "redmi note 10s\n");
	}

	@Given("User Click The First Product On That Page")
	public void user_click_the_first_product_on_that_page() {
		elementclick(pom.getFlipkart().getFirst_product());
	}

	@Given("Product Open On New Tab Page")
	public void product_open_on_new_tab_page() {
		switchtowindow("REDMI Note 10S ( 64 GB Storage, 6 GB RAM ) Online at Best Price On Flipkart.com");
	}

	@Given("Check The Product is Greater Than Or Equal To Zero")
	public void check_the_product_is_greater_than_or_equal_to_zero() {
		WebElement price = driver.findElement(By.xpath("(//div[contains(text(),'₹')])[1]"));
		String text = price.getText().replaceAll("[^0-9]", "");
		int parseInt = Integer.parseInt(text);
		if (parseInt >= 0) {
			System.out.println("Test pass");
		}else {
			Assert.fail();
		}
	}

	@Given("User Enter The Pincode")
	public void user_enter_the_pincode() {
		elementsendkeys(pom.getFlipkart().getEnter_pincode(), "625531\n");
	}

	@Given("User Click The View Details")
	public void user_click_the_view_details() {
		elementclick(pom.getFlipkart().getClick_view());
	}

	@Given("User Close The View Details Page")
	public void user_close_the_view_details_page() {
		elementclick(pom.getFlipkart().getClose_view());
	}

	@Given("User Click The Add TO Cart Button")
	public void user_click_the_add_to_cart_button() {
		elementclick(pom.getFlipkart().getAddtocart());
	}

	

}
