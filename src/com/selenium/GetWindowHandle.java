package com.selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	Thread.sleep(4000);
	String parent = driver.getWindowHandle();
	Set<String> s = driver.getWindowHandles();
	// Now Iterator using Iterator
	Iterator<String> i = s.iterator();
	String chlid_window = null;
	while(i.hasNext()) chlid_window = i.next();
	if(!parent.equals(chlid_window))
	{
	   driver.switchTo().window(chlid_window);
	   
	   System.out.println(driver.switchTo().window(chlid_window).getTitle());
	}
	
	driver.switchTo().window(parent);
}

}

