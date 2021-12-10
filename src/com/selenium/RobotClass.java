package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	public static void main (String [] args) throws AWTException, InterruptedException  {
		System.setProperty("webionar.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	     WebDriver  driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     Actions act= new Actions(driver);
	     WebElement img = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
			act.contextClick(img).perform();
			Thread.sleep(3000);
			Robot r = new Robot();
			r.keyPress(MenuKeyEvent.VK_DOWN);
			r.keyRelease(MenuKeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(MenuKeyEvent.VK_DOWN);
			r.keyRelease(MenuKeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(MenuKeyEvent.VK_DOWN);
			r.keyRelease(MenuKeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(MenuKeyEvent.VK_DOWN);
			r.keyRelease(MenuKeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(MenuKeyEvent.VK_DOWN);
			r.keyRelease(MenuKeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(MenuKeyEvent.VK_DOWN);
			r.keyRelease(MenuKeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(MenuKeyEvent.VK_DOWN);
			r.keyRelease(MenuKeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(MenuKeyEvent.VK_DOWN);
			r.keyRelease(MenuKeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(MenuKeyEvent.VK_DOWN);
			r.keyRelease(MenuKeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(MenuKeyEvent.VK_ENTER);
			r.keyRelease(MenuKeyEvent.VK_ENTER);
			Thread.sleep(4000);
			driver.close();
		}
	
}
