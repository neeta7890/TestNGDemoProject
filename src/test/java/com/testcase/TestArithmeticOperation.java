package com.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.services.IArithmeticOperation;
import com.services.MathService;

public class TestArithmeticOperation implements IArithmeticOperation{
	
	Integer a=20,b=2;
	
	@Test(priority=1)
	public void testAdd()
	{
		System.out.println("TC1 : Addition" +(a+b));
	}
	
	@Test(priority=2)
	public void testSub()
	{
				
		System.out.println("TC2 : Substraction" +(a-b));
		
	}
	
	@Test(priority=3)
	public void testMul()
	{
		System.out.println("TC3 : Multiplication" +(a*b));
		
	}
	@Test(priority=4)
	public void testDiv()
	{
		System.out.println("TC2 : Division" +(a/b));
		
	}

}
