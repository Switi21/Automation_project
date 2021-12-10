package com.testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {
	@Test
	public void testA()
	{
		System.setProperty("webdriver.chrome.driver", "webdriver.chrome.driver\", \"E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*WebElement username=driver.findElement(By.id("txtUsername"));
		boolean v=username.isEnabled();
		Assert.assertTrue(true);*/
		String aTitle=driver.getTitle();
		System.out.println(aTitle);
		String eTitle="orangeHRM";
		Assert.assertEquals(eTitle, aTitle);
	}
	
	@Test
	public void testB()
	{
		System.setProperty("webdriver.chrome.driver", "webdriver.chrome.driver\", \"E:\\\\\\\\eclipse programs\\\\\\\\Automation_project\\\\\\\\Drivers\\\\\\\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.id("txtUsername"));
		boolean v=username.isEnabled();
		Assert.assertTrue(v);
		/*String aTitle=driver.getTitle();
		System.out.println(aTitle);
		String eTitle="orangeHRM";
		Assert.assertEquals(eTitle, aTitle);*/
	}
}
