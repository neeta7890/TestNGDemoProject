package com.testcase;

import org.testng.annotations.Test;

public class DemoOtherAttributes {
	@Test(groups="GroupA")
	public void testJava()
	{
		System.out.println("Test Java : TC1");
	}
	
	@Test(groups="GroupA")
	public void testPython()
	{
		System.out.println("Test Python : TC2");
	}
	
	@Test(dependsOnGroups="GroupA")
	public void testRuby()
	{
		System.out.println("Test Ruby : TC3");
	}
	
	@Test(dependsOnGroups="GroupA")
	public void testCsharp()
	{
		System.out.println("Test Sharp : TC1");
	}

}
