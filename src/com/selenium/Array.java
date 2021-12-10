package com.selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Array {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("file:///D:/Capgemini/Book.html");
	        WebElement selectobj = driver.findElement(By.id("slv"));
	        Select sel = new Select(selectobj);
	        List<WebElement> allOptions = sel.getOptions();
	        System.out.println("All Elements");
	        for (WebElement ww1 : allOptions){
	            String s = ww1.getText();
	            System.out.println(s);
	        }
	        HashSet<String>unique_strings = new HashSet();
	        for (WebElement ww2 : allOptions){
	            String ss = ww2.getText();
	            unique_strings.add(ss);
	        }
	        System.out.println("Unique Elements");
	        for (String sss : unique_strings){
	            System.out.println(sss);
	        }
	    }
	
}
