package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("//label[@id='keepLoggedInLabel']"));
	boolean ena=driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).isEnabled();
	
	if(ena==true)
	{
		System.out.println("Enable");
	}
	else {
		System.out.println("Not Enable");
	
	}
	
	}
	
}
