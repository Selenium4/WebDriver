package com.suijtha.practies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://hdfcbank.com");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle(); //111111
		//System.out.println(parent);
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> windows=driver.getWindowHandles();//111111&222222
		Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			String child=it.next().toString();
			//System.out.println(child);
			driver.switchTo().window(child);
			driver.close();
		}
		/*for (String child : windows) 
		{
			//System.out.println(child);
			driver.switchTo().window(child);
			//System.out.println(driver.getTitle());
			//driver.close();
			if (!parent.equals(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
			if (!driver.getTitle().equals("NetBanking"))
			{
				driver.close();
			}
			
		}*/
		

	}

}
