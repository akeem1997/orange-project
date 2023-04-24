package TestCases;

import ObejectRepos.Homepage;
import ObejectRepos.orangeHRMhomePage;
import Utility.baseclass;

public class tc23 extends baseclass {

	public static void main(String[] args) {
		browserName("chrome");
		OpenURL();
		sleep();
		Homepage.Logindetails("Admin", "admin123");
		sleep();
		orangeHRMhomePage.clickMaintenance();
		sleep();
		back();
		orangeHRMhomePage.clickAdmin();
		sleep();
		orangeHRMhomePage.clickbuzz();
		sleep();
		orangeHRMhomePage.clickDashBoard();
		sleep();
		orangeHRMhomePage.clickDirectory();
		sleep();
		orangeHRMhomePage.clickLeave();
		sleep();
		orangeHRMhomePage.clickMaintenance();
		back();
		sleep();
		orangeHRMhomePage.clickMyInfo();
		sleep();
		orangeHRMhomePage.clickPim();
		sleep();
		orangeHRMhomePage.clickTime();
		sleep();
		orangeHRMhomePage.clickSearch();
		sleep();
		quit();

	}

}
