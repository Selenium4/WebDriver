package com.suijtha.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		
		WebElement header=driver.findElement(By.id("nav-xshop"));
		
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		
		System.out.println(headerLinks.size());
		for (int i = 0; i < headerLinks.size(); i++)
		{
		System.out.println(headerLinks.get(i).getText());	
		}
		
	}

}
