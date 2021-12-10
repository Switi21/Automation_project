package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableText {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webionar.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	     WebDriver  driver= new ChromeDriver();
	     driver.get("file:///D:/Capgemini/selenium%20program/Disable.html");
	     JavascriptExecutor j =(JavascriptExecutor)driver;
	     Thread.sleep(10000);
	     String str="document.getElementById('n').value='switi'";
	    j.executeScript(str);
	    Thread.sleep(10000); 
	    String str1="document.getElementById('n').value=''";
	    j.executeScript(str1);
	    Thread.sleep(10000);
	    String click="document.getElementById('n').value='switi'";
	    j.executeScript(click);
	    
	}
}
