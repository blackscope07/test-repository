package com.test;

import java.util.Scanner;

public class OpertorTest {

	public static void main(String[] args) {
		
		int a=10,b=56,c=42;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(a%b);
		System.out.println();
		
		
		System.out.println(b<a && b<c);
		System.out.println(b>a || b>c);
		System.out.println(b!=a);		
		Scanner obj=new Scanner(System.in);
		System.out.println();
		System.out.println(obj instanceof Scanner);
		System.out.println(a-- - --a+a++ - --a);
		
		
		
		
		

	}

}
