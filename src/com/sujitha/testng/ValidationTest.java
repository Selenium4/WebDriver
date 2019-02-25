package com.sujitha.testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest {

	@Test
	public void validation()
	{
		String value1="Selenium";
		String value2="Selenium";
		
		//Assert.assertEquals(value1, value2);
		Assert.assertEquals(12, 12);
	}

}
