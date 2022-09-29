package com.testcase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.utils.TestDataProvider;

public class DataProviderDemo {



   @Test(dataProvider = "getData")
    public void testMe(String uname,String role)
    {
        System.out.println("Name :"+uname+" Role: "+role);
    }
    
    @DataProvider
    public Object[][]  getData()
    {
        return TestDataProvider.getDataFromExcel("‪‪C:\\Users\\NMANAKAW\\OneDrive - Capgemini\\Documents\\MyTestData.xlsx", "roles");
    }
}