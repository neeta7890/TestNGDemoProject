package com.testcase;

import java.util.Scanner;

import org.testng.annotations.Test;

import com.customexception.InvalidNumberRangeException;
import com.services.MathServicesImp;

public class TestMathServicesImp {
	Scanner sc=new Scanner(System.in);
	@Test
	public void test_all_cases() throws InvalidNumberRangeException
	{
		MathServicesImp msi=new MathServicesImp();
		while(true)
		{
			System.out.println("Enter First value:");
			int a=sc.nextInt();
			System.out.println("Enter Second value:");
			int b=sc.nextInt();
			int res_add=msi.testAdd(a,b);
			try
			{
				if(a<=0 || b<0)
					throw new InvalidNumberRangeException("Number can not be negative value");
			}
			catch(InvalidNumberRangeException e)
			{
				System.out.println(e);
				break;
			}
			System.out.println(res_add);
			System.out.println("Do you want to test more..");
			String test=sc.next();
			if(test.equals("no"))
			{
				System.out.println("Stop test case execution!!");
				break;
			}
			
		}
		
		
	}

}
