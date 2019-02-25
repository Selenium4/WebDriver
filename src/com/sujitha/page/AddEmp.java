package com.sujitha.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmp 
{
	@FindBy(linkText="PIM")
	WebElement pim;
	@FindBy(linkText="Add Employee")
	WebElement addEmp;
	@FindBy(id="firstName")
	WebElement fName;
	@FindBy(id="lastName")
	WebElement lName;
	@FindBy(id="photofile")
	WebElement profile;
	@FindBy(id="btnSave")
	WebElement save;
	
	
	
	public void empAdd()
	{
		pim.click();
		addEmp.click();
		fName.sendKeys("asdfghjk");
		lName.sendKeys("asdfghjkl");
		profile.sendKeys("E:\\Koala.jpg");
		save.click();
	}
	
	
	
}
