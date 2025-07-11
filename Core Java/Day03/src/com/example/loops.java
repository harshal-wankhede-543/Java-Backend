package com.example;

import java.util.Scanner;
public class loops {
	public static void main(String[] args) {
//		half diamond
		for(int i=1 ; i<=5 ;i++ ){
			for(int j=1 ; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=4 ; i>=0 ;i-- ){
			for(int j=1 ; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println();
		
//		square pattern
//		for(int i=1 ; i<=5 ;i++ ){
//			for(int j=1 ; j<=5;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//		System.out.println();
		

	for(int i=1 ; i<=5 ;i++ ){
		for(int j=i ; j<5;j++) {
			System.out.print(" ");
		}
		for(int j=1 ; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	for(int i=1 ; i<=5 ;i++ ){
		for(int j=2 ; j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=i ; j<=5;j++) {
			System.out.print("*");
		}
		
		System.out.println();
		
	}
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=4;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println();
		
	}
	for(int i=1;i<=5;i++) {
		for(int j=2;j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j<=5;j++) {
			System.out.print("*");
		}System.out.println();
		
	}	
	}

}
