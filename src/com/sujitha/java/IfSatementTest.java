package com.sujitha.java;

import java.util.Scanner;

public class IfSatementTest 
{
	public static void main(String[] args)
	{
		//to check given no is even / odd number
		//int n=59;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if (n%2==0)
		{
		System.out.println("Even Number");	
		}else
		{
			System.out.println("Odd Number");
		}

	}

}
