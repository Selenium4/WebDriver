package com.sujitha.java;

public class Vasu
{
//variable
	int i=10;
	
//methods
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		//object
		Vasu v=new Vasu();
		v.add();// method
		System.out.println(v.i);

	}

}
