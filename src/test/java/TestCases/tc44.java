package TestCases;

import ObejectRepos.Homepage;
import ObejectRepos.orangeHRMhomePage;
import ObejectRepos.orangeHRmDropDown;
import Utility.baseclass;

public class tc44 extends baseclass {

	public static void main(String[] args) {
		browserName("chrome");
		OpenURL();
		sleep();
		Homepage.Logindetails("Admin","admin123");
		sleep();
		orangeHRMhomePage.clickprofile();
		sleep();
		orangeHRmDropDown.clickSupport();
		sleep();
		quit();
	}

}
