package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\\\eclipse programs\\\\Automation_project\\\\Drivers\\\\chromedriver.exe");
	
	WebDriver  driver= new ChromeDriver();
	driver.get("file:///D:/Capgemini/selenium%20program/Frame1%20(2).html");
	driver.findElement(By.id("fn")).sendKeys("switi");
	driver.switchTo().frame("frm");
	driver.findElement( By.id("mn")).sendKeys("jiwan");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("ln")).sendKeys("Bodhale");
	driver.switchTo().parentFrame();
}
}
