package com.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Test1 {
	@BeforeMethod
	public void beforemethod()
	{

	System.out.println("execute this before everymethod");
	}

	@AfterMethod
	public void aftermethod()
	{

	System.out.println("execute this after everymethod");
	}

	@BeforeClass
	public void beforeclass()
	{

	System.out.println("execute this before every class");
	}

	@AfterClass
	public void afterclass()
	{

	System.out.println("execute this after every class");
	}

	@BeforeTest
	public void beforetest()
	{

	System.out.println("execute this before every test");
	}

	@AfterTest
	public void aftertest()
	{

	System.out.println("execute this after every test");
	}

	@BeforeSuite
	public void beforesuite()
	{

	System.out.println("execute this before every suite");
	}

	@AfterSuite
	public void aftersuite()
	{

	System.out.println("execute this after every suite");
	}

	}

