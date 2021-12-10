package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
public static void main (String [] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("qspiders");
 java.util.List<WebElement> allsuggestions=driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
	//Thread.sleep(20000);
	int count= allsuggestions.size();
	//Thread.sleep(20000);
	System.out.println(count);
	//Thread.sleep(20000);
	
	for(int i=0;i<count;i++)
	{
		WebElement suggestion=allsuggestions.get(i);
		String text=suggestion.getText();
		System.out.println(text);
	}
	//river.close();
}
}
