package ObejectRepos;

import org.openqa.selenium.By;

import Utility.baseclass;

public class orangeHRmDropDown extends baseclass {
	public static By About = By.xpath("//a[contains(text(), \"About\")]");
	public static By Support = By.xpath("//a[contains(text(), \"Support\")]");
	public static By ChangePassword = By.xpath("//a[contains(text(), \"Change\")]");
	public static By Logout = By.xpath("//a[contains(text(), \"Log\")]");
	
	public static void clickAbout() {
		click(About);
	}
	public static void clickSupport() {
		click(Support);
	}
	public static void clickChangePassword() {
		click(ChangePassword);
	}
	public static void clickLogout() {
		click(Logout);
	}

}
