package ObejectRepos;

import org.openqa.selenium.By;

import Utility.baseclass;

public class Homepage extends baseclass {
	
	public static By Username = By.xpath("//h5[contains(text(), \"\")]//following::input[2]");
	public static By password = By.xpath("//input[@name=\"password\"]");
	public static By Login = By.xpath("//button[contains(text(), \"\")]");
	public static By forgottenpassword = By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]");
	
	public static void Logindetails(String Uname, String pass) {
		entertext(Username, Uname);
		entertext(password, pass);
		click(Login);
		
		
	}

}
