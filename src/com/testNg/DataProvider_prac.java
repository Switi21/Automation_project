package com.testNg;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_prac {
@DataProvider

public Object[][] getdata()
{
	Object[][] ref=new Object[2][2];
	ref[0][0]="usera";
	ref[0][1]="passa";
	ref[1][0]="userb";
	ref[1][1]="passb";
	return ref;
}
@Test(dataProvider="getdata")
public void createuser(Object un, Object pw)
{
	Reporter.log(un+" "+pw,true);
}
}
