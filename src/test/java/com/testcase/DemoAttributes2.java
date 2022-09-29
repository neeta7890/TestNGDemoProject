package com.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAttributes2 {
	
	@Test
	public void login_test()
	{
		System.out.println("TC 1: Login Test Case");
		Assert.fail();
	}
	
	@Test(dependsOnMethods ="composeMail_Test" )
	public void sendMail_test()
	{
		System.out.println("TC 2:SendMail Test Case");
	}
	
	@Test(dependsOnMethods ="login_test",alwaysRun =true)
	public void composeMail_Test()
	{
		System.out.println("TC 3: Compose Test Case");
	}

}
