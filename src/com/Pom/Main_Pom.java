package com.Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Pom {
public static void main(String [] args) {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Pom ref= new Pom(driver);
	ref.enterUsername("Admin");
	ref.enterPassword("admin123");
	ref.clickLogin();
	//ref.clickadmin(driver);
	
}
}
