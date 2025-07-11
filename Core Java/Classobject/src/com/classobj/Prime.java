package com.classobj;

import java.util.Scanner;

public class Prime {
	public static void prime(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a no to check whether it is prime no OR Composite");
		
		int checkprime = sc.nextInt();
		
		if(checkprime % 2 == 0 && checkprime % 3 == 0 && checkprime % 5== 0 && checkprime % 7== 0){
			System.out.print("It is composite number");
		}else if(checkprime ==2 && checkprime == 3 && checkprime == 5 && checkprime ==7){
			System.out.println("It is prime no");		
		}else{
			System.out.println("It is prime no");
	}}

}