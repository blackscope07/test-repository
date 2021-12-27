package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamicintalization {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//InputStreamReader isr=new InputStreamReader(System.in);
		
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		
		Float a,b;
		String name;
		char x;
		
		System.out.println("Enter Ur Name:");
		name=obj.readLine();
		System.out.println("Thank u For Choosing Us"+name);
		//System.out.println("Please enter the value on below");
		System.out.println("Enter the value of a:");
		a=Float.parseFloat(obj.readLine());
		
		System.out.println("Enter the value of b:");
		b=Float.parseFloat(obj.readLine());
		
		System.out.println("sum:"+(a+b));
		//System.out.println("Thank u to help u");
		System.out.println("enter the charater ");
		x=(char)obj.read();
		System.out.println(x);
         
	}

}
