package com.test;

import java.util.Scanner;

public class SwicthTest {

	public static void main(String[] args) {
       
		int a;
		Scanner on=new Scanner(System.in);
		System.out.println("Enter the no on 1 to 7");
		a=on.nextInt();
		
		switch(a){

		case 1:System.out.println("It is Sunday");
	       break;
		case 2:System.out.println("It is Monday");
	       break;
		case 3:System.out.println("It is Tuesday");
	       break;
		case 4:System.out.println("It is Wednesday");
	       break;
		case 5:System.out.println("It is Thursday");
	       break;
		case 6:System.out.println("It is Friday");
	       break;
		case 7:System.out.println("It is Saturday");
	       break;
		default:System.out.println("Wrong Input !!");
			
		}
		on.close();

	}

}
