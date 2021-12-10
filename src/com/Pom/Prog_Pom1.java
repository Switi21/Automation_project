package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prog_Pom1 {
	
		@FindBy(id="txtUsername")
		private WebElement unTB;
		
		@FindBy(id="txtPassword")
		private WebElement pwTB;
		
		@FindBy (xpath="//input[@type='submit']")
		private WebElement btnLogin;

	public Prog_Pom1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pn)
	{
		pwTB.sendKeys(pn);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	/*@FindBy(id="menu_pim_Configuration")
	private WebElement btncon;
	
	@FindBy(xpath="//b[text()='PIM']")
	private WebElement btnpim;
	
	@FindBy(xpath="//a[text()='Data Import']")
	private WebElement btndata;
	
	public void Action(WebDriver driver)
	{
	Actions act = new Actions(driver);
	act.moveToElement(btnpim).perform();;
	act.moveToElement(btncon).perform();;
	btndata.click();
	}*/
	@FindBy (id="menu_admin_viewAdminModule")
	private WebElement btnadmin;
	
	@FindBy(id="menu_admin_UserManagement")
	private WebElement btnum;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	private WebElement btnuser;
	
	@FindBy(id="btnAdd")
	private WebElement btnadd;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement ename;
	
	@FindBy(id="systemUser_userName")
	private WebElement uname;
	
	@FindBy(id="systemUser_password")
	private WebElement pwd;
	
	@FindBy(id="systemUser_confirmPassword")
	private WebElement cpwd;
	
	@FindBy(id="btnSave")
	private WebElement save;
	
	public void Action(WebDriver driver)
	{
	Actions act = new Actions(driver);
	act.moveToElement(btnadmin).perform();;
	act.moveToElement(btnum).perform();;
	btnuser.click();
	btnadd.click();
	}
	
	public void enterEname(String en)
	{
		ename.sendKeys(en);
	}
	
	public void enterUname(String un)
	{
		uname.sendKeys(un);
	}
	
	public void enterPwd(String pn)
	{
		pwd.sendKeys(pn);
	}
	
	public void enterCPwd(String cpn)
	{
		cpwd.sendKeys(cpn);
	}
	public void clickSave()
	{
		save.click();
	}
	
}

