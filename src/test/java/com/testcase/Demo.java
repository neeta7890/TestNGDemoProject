package com.testcase;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeSuite
    public void inti()
    {
        System.out.println("----------------Before suit in Demo------------------");
    }
    
    @BeforeTest
    public void setUpTestEnv()
    {
      System.out.println("-------Before all the tests set up env--------------");    
    }
    
    @BeforeClass
    public void fun()
    {
        System.out.println("Fun : in before class methods");
    }
    
    @BeforeMethod
    public void setUpTestData()
    {
        System.out.println("---setup TestData-----");
    }
    
    @Test(priority=-3,expectedExceptions=ArithmeticException.class)
    public void atest()
    {
        System.out.println("Test Case 3: C ");
        int a=5,b=0;
        int res=a/b;
        throw new SkipException("Skipping it deliberatly");
    }
    
    @Test(priority=2,invocationCount = 3)
    public void btest()
    {
        System.out.println("Test Case 1: A ");
    }
    
    @Test(priority=1,description="This is B Test Case",timeOut =1)
    public void ctest()
    {
        System.out.println("Test Case 2: B ");
    }
    
    @AfterSuite
    public void tearDown()
    {
        System.out.println("-----------After Suit in Demo----------");
        
    }
    
    @AfterTest
    public void tearDownTestEnv()
    {
      System.out.println("-------after all the tests tear down  env--------------");    
    }
    
    @AfterMethod
    public void tearDownTestData()
    {
        System.out.println("---TearDown TestData-----");
    }
}