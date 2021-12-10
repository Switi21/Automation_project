package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_drop_down {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Capgemini/Book.html");
	WebElement obj= driver.findElement(By.id("slv"));
	Select a=new Select(obj);
	List<WebElement> m = a.getOptions();
	int count =m.size();
	System.out.println(count);
	for(int i=0; i<count; i++) {
		WebElement element= m.get(i);
		String str= element.getText();
		System.out.println(str);
	
	}
	}
	
	}
