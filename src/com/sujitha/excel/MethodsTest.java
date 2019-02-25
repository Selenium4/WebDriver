package com.sujitha.excel;

public class MethodsTest
{
	public int add()
	{
		int a=30;
		int b=40;
		int sum=a+b;
		//System.out.println(sum);	
		return sum;
	}
	public static void main(String[] args)
	{
		MethodsTest v=new MethodsTest();
		//v.add();//calling method with method name//it won't give return value
	int res=v.add();//calling a method with variable //it will give return value
	System.out.println(res);
	}

}
