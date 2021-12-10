package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webionar.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	     WebDriver  driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://demo.guru99.com/test/drag_drop.html");
	     WebElement ele=driver.findElement(By.xpath(""));
	   
	    WebElement ele1= driver.findElement(By.xpath("//a[@class='button button-orange']"));
	    Actions act=new Actions(driver);
	    act.dragAndDrop(ele,ele1).perform();
	     
	     
	}
}
