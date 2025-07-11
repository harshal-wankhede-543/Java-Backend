package com.example;
import java.util.Scanner;

public class twoDarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter the size of the 2D array");
//		int inputmain = sc.nextInt();
		
		System.out.println("Enter the no of rows & columns");
		
//		Get the no. of Rows
		System.out.println("Enter the no. of Rows");
		
		int inputone = sc.nextInt();
		
		
//		Get the no. of Columns
		System.out.println("Enter the no. of columns");
		int inputtwo = sc.nextInt();
		
		
		
		int size = inputone*inputtwo;
		System.out.println("Total size will be ="+ size);
		
		
		int arr1[][] = new int[inputone][inputtwo];
		
		for(int i=0;i<inputone;i++) {
			for(int j=0;j<inputtwo;j++) {
				System.out.println("Value for index"+"["+ i+"]" + "["+j+"]");
				arr1[i][j]=sc.nextInt();
			}
			
			
			
		}
		System.out.println("The matrix formed is = ");
		for(int i=0;i<inputone;i++) {
			for(int j=0;j<inputtwo;j++) {
//				System.out.print("Value for index"+"["+ i+"]" + "["+j+"]"+"will be  = ");
				System.out.print(" "+arr1[i][j]+" ");
			}
			System.out.println();
			}
			
			
			
		}
		
		
		
	

}


