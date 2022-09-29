package com.utils;
import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class TestDataProvider {
//helper method: to fetch the data form excel and fill into Object array and return
    
public static Object[][] getDataFromExcel(String filepath,String sheetname)
{
    Object[][] objarr=null;
    
    
    try {
        Workbook wb=WorkbookFactory.create(new File(filepath));
        
        Sheet sh=wb.getSheet(sheetname);
        
        int rows=sh.getLastRowNum();
        int cols=sh.getRow(0).getLastCellNum();
        
        objarr=new Object[rows][cols];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                objarr[i][j]=sh.getRow(i+1).getCell(j).toString();
            }
        }
        
        
    } catch (EncryptedDocumentException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    return objarr;
    
}
    
    
    
}
