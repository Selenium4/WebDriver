package com.suijtha.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedbusTest
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.quikr.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchedCat")).click();
		Thread.sleep(2000);
		List<WebElement> cities=driver.findElements(By.xpath(".//*[@id='category-dropdown']/ul/li/a"));
		System.out.println(cities.size());
		for (WebElement element : cities) 
		{
			System.out.println(element.getText());
		}
	}

}
