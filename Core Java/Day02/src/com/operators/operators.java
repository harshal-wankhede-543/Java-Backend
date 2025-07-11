package com.operators;

import java.util.Scanner;
public class operators {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a no to check Prime Or Composite = ");

		int checkprime = sc.nextInt();
	
		if(checkprime ==2 && checkprime == 3 && checkprime == 5 && checkprime ==7){
		System.out.print("It is prime");
		}else if(checkprime % 2 == 0 && checkprime !=2 || checkprime % 3 == 0 && checkprime !=3|| checkprime % 5== 0 && checkprime !=5 || checkprime % 7== 0 && checkprime !=7){
		System.out.println("It is composite");		
		}else{
		System.out.println("It is prime");
	}
}}
