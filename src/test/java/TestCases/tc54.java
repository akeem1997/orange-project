package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObejectRepos.Homepage;
import Utility.baseclass;

public class tc54 extends baseclass {
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
	
	@Test(priority = 4, dataProvider = "getOrange")
	public void Logindetails(String Uname, String pass) throws Exception {
		Homepage.Logindetails(Uname, pass);
		sleep();
		boolean errorMessage = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")).isDisplayed();
		if(errorMessage) {
			System.out.println("error message is displayed");
			
		}
		else {
			System.out.println("no error message");
		}
		Thread.sleep(4000);
	}
	//Using data provider by trying invalid inputs then one valid input
	@DataProvider
	public String [][] getOrange() throws Exception {
		File excelFile = new File("C:\\Users\\akeem\\eclipse-workspace\\project_Orange\\src\\test\\java\\dataset\\orandeExcel.xlsx");
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("orange");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCols = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[noOfRows][noOfCols];
		for(int i = 0; i <noOfRows; i++) {
			for(int j = 0; j <noOfCols; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		workbook.close();
		fis.close();
		return data;
	}
	
	@Test(priority = 5)
	public void enablesleep() {
		sleep();
	}
	
	@Test(priority = 6)
	public void close() {
		quit();
	}
	

}
