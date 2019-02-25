package com.sujitha.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpAdd extends ORHRM
{
@Test
public void empAdd()
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	
	driver.findElement(By.id("firstName")).sendKeys("afadfadfh");
	driver.findElement(By.id("lastName")).sendKeys("adfhjdghkghk");
	
	//driver.findElement(By.id("photofile")).click();
	driver.findElement(By.id("photofile")).sendKeys("E:\\Koala.jpg");
	/*Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fileupload.exe");
	
	Thread.sleep(2000);*/
	
	driver.findElement(By.id("btnSave")).click();
}
}
