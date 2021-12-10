package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
//Declaration
	@FindBy(id="txtUsername")
	private WebElement unTB;
	
	@FindBy(id="txtPassword")
	private WebElement pwTB;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement btnLogin;
	@FindBy  (xpath="//input[text()='Admin']")
	private WebElement btnAdmin; 
	@FindBy (xpath="//input[@type='arrow']")
	private WebElement btnUsermanagement;
	@FindBy (xpath="//input[@text='Users']")
	private WebElement btnUser;
	@FindBy(id = "menu_admin_viewSystemUsers")
	private WebElement Users;
	@FindBy(id = "btnAdd")
	private WebElement addbtn;
	@FindBy(xpath = "//*[@id='systemUser_userType']")
	private WebElement userRoleSelect;
	@FindBy(xpath = "//*[@id='systemUser_employeeName_empName']")
	private WebElement ename;
	@FindBy(xpath = "//*[@id='systemUser_userName']")
	private WebElement uname;
	@FindBy(xpath = "//*[@id='systemUser_status']")
	private WebElement statusSelect;
	@FindBy(xpath = "//*[@id='systemUser_password']")
	private WebElement password;
	@FindBy(xpath = "//*[@id='systemUser_confirmPassword']")
	private WebElement cnfPassword;
	@FindBy(id = "btnSave")
	private WebElement btnSave;
	
	//Intialization
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public void enterUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	public void Action(WebDriver driver)
	{
	Actions act = new Actions(driver);
	act.moveToElement(unTB).perform();
	act.moveToElement(pwTB).perform();
	act.moveToElement(btnAdmin).perform();
	act.moveToElement(btnUsermanagement).perform();
	btnLogin.click();
	}
}
