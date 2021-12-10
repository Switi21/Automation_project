package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
WebDriverWait wait=new WebDriverWait(driver, 15);
try
{
	wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
	System.out.println("passed");
}
catch(Exception e){
	System.out.println("Failed");
}
String r = driver.getTitle();
System.out.println(r);
}
}

