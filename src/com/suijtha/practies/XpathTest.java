package com.suijtha.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("VasuDeva");
		
		

	}

}
