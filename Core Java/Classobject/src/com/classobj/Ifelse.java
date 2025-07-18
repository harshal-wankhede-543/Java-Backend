package com.classobj;

import java.util.Scanner;
public class Ifelse {
	public void ifelse() {
		
		Scanner sc = new Scanner("System.in");
		System.out.println("Enter the marks of Subject ");
		int input  = sc.nextInt();
		
		if(input==100) {
			System.out.println("You are topper");
		}else if(input <100 && input >60) {
			System.out.println("Do something better");
		}else {
			System.out.println("Abba nhi manenge");
		}
	}
}
