package com.test;

import java.util.Scanner;

public class ConditionCheck {

	public static void main(String[] args) {
	
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=obj.nextInt();
		System.out.println("Enetr the value of b");
		b=obj.nextInt();
		System.out.println("Enter the value of c");
		c=obj.nextInt();
		
		if(a>b && a>c){
			System.out.println(a+"is the greater no");
			
		}
		else if(b>a && b>c){
			
			System.out.println(b+"is the Greater no");
			
		}
		else{
			System.out.println(c+"is the Greater no");  
			
		}
		if(true){
			System.out.println("Hello World");
		}
      obj.close();
	}

}
