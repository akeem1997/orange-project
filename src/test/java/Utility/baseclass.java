package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	
	public static WebDriver driver;
	
	public static void browserName(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\project_Orange\\lib4\\chromedriver.exe");
			driver = new ChromeDriver(co);
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
	
	public static void  OpenURL() {
		try {
			driver.get("https://opensource-demo.orangehrmlive.com/");
			System.out.println("URL is up and running");
		} catch (Exception e) {
			System.out.println("Unable to launch URL");
		}
	}
	
	public static void click (By loc) {
		try {
			driver.findElement(loc).click();
			System.out.println("click on" + loc + "value");
		} catch (Exception e) {
			System.out.println("unable to clck" + loc + "value");
		}
		
		
	}
	
	public static void entertext(By loc, String data) {
		try {
			driver.findElement(loc).sendKeys(data);
			System.out.println("Entered" + data + "text");
		} catch (Exception e) {
			System.out.println("Unable to click on" + data + "text" );
			
		}
	}
	
	public static void sleep () {
		try {
			Thread.sleep(7000);
			System.out.println("sleeping in process");
		} catch (Exception e) {
			System.out.println("Unable to sleep");
		}
	}
	
	public static void quit () {
		try {
			driver.close();
			System.out.println("closing browser");
		} catch (Exception e) {
			System.out.println("Unable to close browser");
		}
	}
	public static void select(By locName, String data) {
		try {
			new Select(driver.findElement(locName)).selectByVisibleText(data);
			System.out.println("able to click on" + locName + "having" + data);
		} catch (Exception e) {
			System.out.println("unable to click on" + locName + "having no" + data);
		}
		
	}
	
	public static void selec(By locName, String data) {
		try {
			new Select(driver.findElement(locName)).selectByValue(data);
			System.out.println("able to click on" + locName + "having" + data);
			
		} catch (Exception e) {
			System.out.println("unable to click on" + locName + "having no" + data);
			
		}
	}
	
	public static void back() {
		try {
			driver.navigate().back();
			System.out.println("moving back to previous page");
		} catch (Exception e) {
			System.out.println("Unable to move back to previous page");
		}
	}

}
