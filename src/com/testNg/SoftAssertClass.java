package com.testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {
	
	@Test
	public void verifyTitle()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\\\eclipse programs\\\\Automation_project\\\\Drivers\\\\chromedriver.exe " );
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	String expectedtitle = "google";
	String actual = driver.getTitle();
	SoftAssert s=new SoftAssert();

	//Assert.assertEquals(actual, expectedtitle);
	//Assert.assertNotEquals(actual, expectedtitle);
	//Assert.assertSame(actual, expectedtitle);
	//Assert.assertNotEquals(actual, expectedtitle);
	//Assert.assertNull(actual, expectedtitle);
	Assert.assertNotNull(actual, expectedtitle);
	//s.assertEquals(actual, expectedtitle);
	driver.close();
	//s.assertAll();

	}


}
