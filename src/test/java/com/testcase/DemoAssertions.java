package com.testcase;


import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class DemoAssertions {
	
	@Test
	public void OpenPage()
	{
		String exttitle="Google.com";
		String actualtitle="Goddle.com";
		SoftAssert ass=new SoftAssert();
		
		ass.assertEquals(actualtitle,exttitle);
		ass.assertEquals("htt", "httt");
		ass.assertAll();
	}

}
