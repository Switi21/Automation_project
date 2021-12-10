package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("//a[@id='loginButton']")).click();
		Thread.sleep(10000);
		WebElement ele=driver.findElement(By.xpath("//div[@id='logo_aT']"));
		String s1=ele.getText();
		String s2=ele.getAttribute("id");
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
}
