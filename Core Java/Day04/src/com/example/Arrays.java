package com.example;

import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a size of Array");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Array index"+i);
			arr1[i]=sc.nextInt();
			
		}
		System.out.println("The array formed will be");
		for(int i=0;i<size;i++) {
			
			System.out.print(" "+ arr1[i]);
		}
		System.out.println("");
		System.out.println("The even numbers formed will be");
		
		for(int i=0;i<size;i++) {
			if(arr1[i]%2==0) {
				System.out.println(arr1[i]);
			}
		}
		
	}

}
