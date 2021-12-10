package com.testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod2 {
	@Test()
	public void registerUser()
	{
	Reporter.log("register",true);

	}

	@Test
	public void edituser()
	{
	Reporter.log("edit",true);

	}

	@Test(alwaysRun = true)
	public void Updateuser()
	{
	Reporter.log("update",true);

	}



	@Test(dependsOnMethods = {"registerUser","edituser"})
	public void DeleteUser()
	{
	Reporter.log("delete",true);

	}
	
}
