package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiLogo_Display {
	
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\\\eclipse programs\\\\Automation_project\\\\Drivers\\\\chromedriver.exe " );
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.get("https://demo.actitime.com/login.do");
//boolean ele=driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
WebElement ele1= driver.findElement(By.xpath("//div[@class='atLogoImg']"));
boolean s= ele1.isDisplayed();
if(s==true) {
	System.out.println("Displayed");
}
else {
System.out.println("Not Displayed");
}
//boolean eleEnabled= driver.findElement(By.xpath("xpath")).isEnabled("//div[@class='atLogoImg']");
		}
		}
