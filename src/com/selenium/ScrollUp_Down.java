package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.selenium.dev/downloads/");
		 driver.get("https://www.youtube.com/watch?v=CWnu8pQRCkQ");
		    driver.manage().window().maximize();
		    JavascriptExecutor j=(JavascriptExecutor)driver;
		    Thread.sleep(2000);
		    String SDown="window.scrollBy(0,2000)";
		    j.executeScript(SDown);
		    Thread.sleep(2000);
		    String SUp="window.scrollBy(0,-1000)";
		    j.executeScript(SUp);
}
}