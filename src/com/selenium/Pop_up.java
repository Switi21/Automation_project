package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","E:\\\\eclipse programs\\\\Automation_project\\\\Drivers\\\\chromedriver.exe");
		
		WebDriver  driver= new ChromeDriver();
		driver.get("file:///D:/Capgemini/selenium%20program/Pop.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(10000);
		Alert a=driver.switchTo().alert();
		String str=a.getText();
		System.out.println(str);
		a.dismiss();
}
}