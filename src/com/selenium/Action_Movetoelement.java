package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Movetoelement {

	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webionar.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	     WebDriver  driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");;
	     driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");;
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     Actions act=new Actions(driver);
	   WebElement ele=  driver.findElement(By.xpath("//b[text()='PIM']"));
	   act.moveToElement(ele).perform();
	   WebElement ele1=driver.findElement(By.xpath("//a[@id='menu_pim_Configuration']"));
	   act.moveToElement(ele1).perform();
	     driver.findElement(By.xpath("//a[text()='Data Import']")).click();
	    
	}
}
