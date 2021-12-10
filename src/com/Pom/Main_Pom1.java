package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Pom1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Prog_Pom1 ref=new Prog_Pom1(driver);
		ref.enterUsername("Admin");
		ref.enterPassword("admin123");
		ref.clickLogin();
		Thread.sleep(3000);
		 ref.Action(driver);
		 ref.enterEname("Switi Bodhale");
		 ref.enterUname("Switi");
		 ref.enterPwd("Switi@123");
		 ref.enterCPwd("Switi@123");
		 ref.clickSave();
}
}
