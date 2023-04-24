package TestCases;

import org.testng.annotations.Test;

import ObejectRepos.Homepage;
import ObejectRepos.myAdminPage;
import ObejectRepos.orangeHRMhomePage;
import Utility.baseclass;

public class tc1 extends baseclass {
	@Test(priority =1)
	public void browser() {
		browserName("chrome");
		
		
	}
	
	@Test(priority = 2)
	public void openurl() {
		OpenURL();
	}
	
	@Test(priority = 3)
	public void enableSleep() {
		sleep();
		
	}
	
	@Test(priority = 4)
	public void Logindetails() {
		Homepage.Logindetails("Admin", "admin123");
	}
	
	@Test(priority = 5)
	public void enableSlee() {
		sleep();
		
	}
	
	@Test(priority = 6)
	public void admin() throws Exception {
		orangeHRMhomePage.clickAdmin();
		Thread.sleep(4000);
	}
	
	@Test(priority = 7)
	public void adminfill() throws Exception {
		myAdminPage.MyAdminPageFill("akeem", "A", "Peter Mac Anderson", "Enabled");
		Thread.sleep(7000);
	}
	
	@Test(priority = 8)
	public void resetfill() throws Exception {
		myAdminPage.clickReset();
		Thread.sleep(5000);
	}
	
	@Test(priority = 9)
	public void adminfill2() {
		myAdminPage.MyAdminPageFill("ola", "B", "Bryan Johnson", "Enabled");
	}
	
	@Test(priority = 10)
	public void resetfill2() {
		myAdminPage.clickReset();
		sleep();
	}
	
	
	@Test(priority = 11)
	public void quitapp() {
		//quit();
		
	}
	

}
