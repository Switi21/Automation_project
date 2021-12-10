package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChooseFile {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Actions act=new Actions(driver);
		WebElement element2=driver.findElement(By.xpath("//b[text()='PIM']"));
		act.moveToElement(element2).perform();
		WebElement element21=driver.findElement(By.xpath("//a[@id='menu_pim_Configuration']"));
		act.moveToElement(element21).perform();
		
		driver.findElement(By.xpath("//a[text()='Data Import']")).click();
		driver.findElement(By.xpath("//a[@title='Download']")).click();//for Download
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("‪D:\\Capgemini\\importData.csv");//for select
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
	}

}