package ObejectRepos;

import org.openqa.selenium.By;

import Utility.baseclass;

public class orangeHRMhomePage extends baseclass {
	public static By search = By.xpath("//div[@class=\"oxd-main-menu-search\"]");
	public static By Admin = By.xpath("//img[@alt=\"client brand banner\"]//following::span[1]");
	public static By PIM = By.xpath("//img[@alt=\"client brand banner\"]//following::span[2]");
	public static By Leave = By.xpath("//img[@alt=\"client brand banner\"]//following::span[3]");
	public static By Time = By.xpath("//img[@alt=\"client brand banner\"]//following::span[4]");
	public static By Recruitment = By.xpath("//img[@alt=\"client brand banner\"]//following::span[5]");
	public static By MyInfo = By.xpath("//img[@alt=\"client brand banner\"]//following::span[6]");
	public static By Performance = By.xpath("//img[@alt=\"client brand banner\"]//following::span[7]");
	public static By Dashboard = By.xpath("//img[@alt=\"client brand banner\"]//following::span[8]");
	public static By Directory = By.xpath("//img[@alt=\"client brand banner\"]//following::span[9]");
	public static By Maintenance = By.xpath("//img[@alt=\"client brand banner\"]//following::span[10]");
	public static By Buzz = By.xpath("//img[@alt=\"client brand banner\"]//following::span[11]");
	public static By profile = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]");
	
	public static void clickSearch() {
		click(search);
	}
	
	public static void clickAdmin() {
		click(Admin);
	}
	
	public static void clickPim() {
		click(PIM);
	}
	
	public static void clickLeave() {
		click(Leave);
	}
	
	public static void clickTime() {
		click(Time);
	}
	
	public static void clickRecruitment() {
		click(Recruitment);
	}
	
	public static void clickMyInfo() {
		click(MyInfo);
	}
	public static void clickPerformance() {
		click(Performance);
	}
	
	public static void clickDashBoard() {
		click(Dashboard);
	}
	public static void clickDirectory() {
		click(Directory);
	}
	
	public static void clickMaintenance() {
		click(Maintenance);
	}
	public static void clickbuzz() {
		click(Buzz);
	}
	
	public static void clickprofile() {
		click(profile);
	}


}
