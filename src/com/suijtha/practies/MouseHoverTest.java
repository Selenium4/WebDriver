package com.suijtha.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		
		WebElement sign=driver.findElement(By.id("nav-link-yourAccount"));
		WebElement yl=driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(sign).build().perform();
		mouse.moveToElement(yl).click().build().perform();

	}

}
