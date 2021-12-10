package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_CLick {
	public static void main (String [] args)  {
		System.setProperty("webionar.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	     WebDriver  driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     Actions act= new Actions(driver);
	    WebElement ele= driver.findElement(By.xpath("//div[@class='atLogoImg']"));
	    act.contextClick(ele).perform();
	    
	    
}
}