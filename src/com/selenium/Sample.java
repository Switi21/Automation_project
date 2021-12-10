package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main (String [] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
     WebDriver  driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://opensource-demo.orangehrmlive.com/");
     //driver.navigate().to("https://www.selenium.dev/downloads/");
     //driver.navigate().back();
     
     String str=driver.getCurrentUrl();
     System.out.println(str);
     String title=driver.getTitle();
     System.out.println(title);
     String source=driver.getPageSource();
     System.out.println(source);
     WebElement s1=driver.findElement(By.xpath("//input[@name='txtUsername']"));
    		String s=s1.getText();
     System.out.println(s);
     Thread.sleep(1000);
     s1.sendKeys("Admin");
     WebElement element=driver.findElement(By.xpath("//input[@name='txtPassword']"));
    String str1=element.getText();
     System.out.println(str1);
     Thread.sleep(1000);
     element.sendKeys("admin123");
     driver.findElement(By.xpath("//input[@type='submit']")).click();;
     
     
     
     

	
}
}
