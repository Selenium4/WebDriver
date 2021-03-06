package com.sujitha.excel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank 
{
	FirefoxDriver driver;
	String res;
	//appLaunch
	public String  appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		//validate
		if (driver.findElement(By.id("txtuId")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		return res;
	}
	//appLogin
	public String appLogin(String username,String password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		//validation
	if(driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
	{
		
		res="Pass";
	}else
	{
	
		res="Fail";
	}
	return res;	
	}
//appLogout
	public String appLogout()
	{
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		if (driver.findElement(By.id("txtuId")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		return res;
	}
	//appClose
	public void appClose()
	{
		driver.close();
	}
	
	//branchCreation
	public String branchCreation(String branchName,String add1) throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("txtZip")).sendKeys("66666");
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		
		String msg=al.getText();
		al.accept();
		//validation
		if (msg.contains("created Sucessfully")) 
		{
			res="Pass";
			
		}else if(msg.contains("already Exist"))
		{
			res="Fail";
			
		}else if(msg.contains("Please fill in"))
		{
			res="Warning";
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		return res;
	}
	public static void main(String[] args) throws Exception
	{
		PrimusBank app=new PrimusBank();
		String results=app.appLaunch("Http://PrimusBank.qedgetech.com");
		System.out.println(results);
		app.appLogin("Admin", "Admin");
		app.branchCreation("asdfghjk", "asdfghhh");
		app.appLogout();
		app.appClose();
	}

}
