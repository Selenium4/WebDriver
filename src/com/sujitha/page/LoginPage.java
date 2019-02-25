package com.sujitha.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
@FindBy(id="txtUsername")
WebElement userName;// page object
@FindBy(id="txtPassword")
WebElement password;// page object
@FindBy(id="btnLogin")
WebElement login;// page object
//method/test case
public void adminLogin()
{
	userName.sendKeys("Admin");
	password.sendKeys("Qedge123!@#");
	login.click();
}
}
