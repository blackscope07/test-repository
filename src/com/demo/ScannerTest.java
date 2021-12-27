package com.demo;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		int a,b;
		boolean t;
		String name;
		
		Scanner obj=new Scanner(System.in);
		
		name=obj.next();
		t=obj.nextBoolean();
		
		System.out.println(name);
		
		
		System.out.println(t);
		System.out.println("Enter the value of a:");
		a=obj.nextInt();
		
		System.out.println("Enter the value of b:");
		b=obj.nextInt();
		
		System.out.println("Addtion:"+(a+b));
		
		obj.close();
		
		

	}

}
