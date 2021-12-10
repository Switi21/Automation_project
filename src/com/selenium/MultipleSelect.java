package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Capgemini/Book.html");
		WebElement obj= driver.findElement(By.id("slv"));
		Select a=new Select(obj);
		a.selectByIndex(0);
		a.selectByIndex(1);
		a.selectByIndex(2);
		a.selectByIndex(3);
		a.deselectAll();
		}
}

