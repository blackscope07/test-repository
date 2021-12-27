package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleIntrest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double p,r,t,i;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader obj=new BufferedReader(in);
		
		System.out.println("Enter the principal amount:");
		p=Double.parseDouble(obj.readLine());
		
		System.out.println("Enter the rate of Intrest:");
		r=Double.parseDouble(obj.readLine());
		
		System.out.println("Enter the time of amount:");
		t=Double.parseDouble(obj.readLine());
		
		i=(p*r*t)/100;
		System.out.println("This is the Intrest amount:"+i);
		

	}

}
