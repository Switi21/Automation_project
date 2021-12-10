package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webionar.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	     WebDriver  driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("file:///C:/Users/me/Desktop/capgemini/HTML1/doubleClick.html");
	     Actions act=new Actions(driver);
	    WebElement ele= driver.findElement(By.xpath("//input[@value='Double-Click']"));
		   act.doubleClick(ele).perform();
		   
}
}