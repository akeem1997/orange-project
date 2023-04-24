package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class loginTest {
	public static WebDriver driver;
	
	@Parameters("browserNameValue")
	@Test(priority = 1)
	public static void browserName(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\project_Orange\\lib4\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println(browser + "is up and running");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\akeem\\eclipse-workspace\\project_Orange\\lib4\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println(browser + "is up and running");
		}
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\akeem\\eclipse-workspace\\project_Orange\\lib4\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println(browser + "is up and running");
			
		}
		else {
			System.out.println("invalid browser");
		}
		
	}
	
	@Test(priority = 2)
	public void Openurl() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
	}
	
	
	@Parameters({"UserNameValue", "PasswordValue"})
	@Test(priority = 3)
	public void Logindet(String uname, String pass) throws Exception {
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 4)
	public void quit() {
		driver.close();
	}
	

}
