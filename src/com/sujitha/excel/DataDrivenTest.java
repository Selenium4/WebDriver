package com.sujitha.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws Exception
	{
		PrimusBank app=new PrimusBank();
		app.appLaunch("Http://Primusbank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rcnt=ws.getLastRowNum();
		for (int i = 1; i <=rcnt; i++)
		{
			String branchName=ws.getRow(i).getCell(0).getStringCellValue();
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			String results=app.branchCreation(branchName, add1);
			ws.getRow(i).createCell(2).setCellValue(results);
			FileOutputStream fos=new FileOutputStream(src);
			wb.write(fos);
		}
		wb.close();
		app.appLogout();
		app.appClose();

	}

}
