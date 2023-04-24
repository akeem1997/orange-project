package ObejectRepos;

import org.openqa.selenium.By;

import Utility.baseclass;

public class myAdminPage extends baseclass {
	
	public static By Username = By.xpath("//h5[contains(text(), \"\")]//following::input[1]");
	public static By UserRole = By.xpath("//h5[contains(text(), \"\")]//following::div[18]");
	public static By Admin = By.xpath("//*[contains(text(),\"Admin\")]");
	public static By Enabled = By.xpath("//*[contains(text(), \"Enabled\")]");
	public static By EmployeeName = By.xpath("//h5[contains(text(), \"\")]//following::input[2]"); 
	public static By status = By.xpath("//h5[contains(text(), \"\")]//following::i[3]");
	public static By Reset = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--ghost\"]");
	public static By Search = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
	public static By Add = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
	
	public static void MyAdminPageFill(String Usname, String Urole, String EmName, String stats) {
		entertext(Username, Usname);
		click(UserRole);
		click(Admin);
		entertext(EmployeeName, EmName);
		click(status);
		click(Enabled);
		click(Search);
		
	}
	
	public static void clickReset() {
		click(Reset);
	}
	
	public static void clickAdd() {
		click(Add);
	}

}
