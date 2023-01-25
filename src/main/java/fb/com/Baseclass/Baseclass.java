package fb.com.Baseclass;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Baseclass {
	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			System.out.println("Unable to browser launch :"+e.getMessage());
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		window_max();
		return driver;
	}
	public static void window_max() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Unable to windowmax :"+e.getMessage());
		}
	}
	public static void get_url(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println("Invalid Url :"+e.getMessage());
		}
	}
	public static void elementsendkeys(WebElement element,String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Unable to sendkeys :"+e.getMessage());
		}
	}
	public static void elementclick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Unable to click :"+e.getMessage());
		}
	}
	public static Boolean isdisplayed(WebElement element) {
		Boolean displayed= false;
		try {
			 displayed = element.isDisplayed();
			// System.out.println(displayed);
		} catch (Exception e) {
			System.out.println("Not Displayed :"+e.getMessage());
		}
		return displayed;
	}
	public static void mousehover(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
		} catch (Exception e) {
			System.out.println("Unable To Move Mouse :"+e.getMessage());
		}
	}
	public static void dropdown(WebElement element,String option,String i) {
		Select s=new Select(element);
		if (option.equals("Index")) {
			s.selectByIndex(Integer.parseInt(i));
		}else if (option.equals("Value")) {
			s.selectByValue(i);
		}else if (option.equals("Text")) {
			s.selectByVisibleText(i);
		}
	}
	public static void switchtowindow(String titlename) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			if (titlename.equalsIgnoreCase(title)) {
				break;
			}
		}
	}
	public static void threadsleepfoesec(int sec) throws InterruptedException {
		TimeUnit.SECONDS.sleep(sec);
	}

	public static void quit() {
		driver.quit();
	}
	public static String gettext(WebElement element) {
		String text=null;
		try {
			 text = element.getText();
		} catch (Exception e) {
			System.out.println("Unable to get text :"+e.getMessage());
		}
		return text;
	}




















}
