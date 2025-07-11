package com.example;

import java.util.Scanner;

public class ScannerOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter Your Name");
//		String name = sc.next();
//		System.out.println("Your name is = "+ name);
//		
//		System.out.println("What is your age ?");
//		int no = sc.nextInt();
//		System.out.println("Your Age is = "+ no);
//		
//		System.out.println("Lets add some random no's");
//		System.out.println("Enter 1st no = ");
//		int numberone = sc.nextInt();
//		System.out.println("enter 2ns no = ");
//		int numbertwo = sc.nextInt();
//		
//		int addition = numberone + numbertwo;
//		
//		System.out.println("Addition of Two nos is "+ addition);
//		
//		System.out.println("Enter your Acquired marks = ");
//		
//		int marks = sc.nextInt();
//		if(marks >=90 && marks<=100) {
//			System.out.println("passed with A grade");
//		}else if(marks >=50 && marks<=70){
//			System.out.println("Need Improvment");
//		}else if(marks >=89 && marks<=71){
//			System.out.println("Passed With b grade");
//		}else {
//			System.out.println("Failed");
//		}
		
		System.out.print("Eneter a no to check whether it is prime no OR Composite");
		
		int checkprime = sc.nextInt();
		
		if(checkprime % 2 == 0 && checkprime % 3 == 0 && checkprime % 5== 0 && checkprime % 7== 0){
			System.out.print("It is composite number");
		}else if(checkprime ==2 && checkprime == 3 && checkprime == 5 && checkprime ==7){
			System.out.println("It is prime no");		
		}else{
			System.out.println("It is prime no");
		}
		
		
		
	}

}
