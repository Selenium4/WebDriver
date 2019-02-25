package com.sujitha.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		LoginPage app=PageFactory.initElements(driver, LoginPage.class);
		app.adminLogin();
		AddEmp app1=PageFactory.initElements(driver, AddEmp.class);
		app1.empAdd();

	}

}
