package com.example;
import java.util.Scanner;

public class Functions {
	
	public static void add(int a, int b) {
		
		int addition = a + b;
		System.out.println("The addition is " + addition);
	}
	public static void sub(int a, int b) {
		
		int substraction = a - b;
		System.out.println("The substraction is " + substraction);
	}
	
	public static int mul(int a,int b) {
		
		return a * b;
	}
	public static int div(int a,int b) {
		
		return a / b;
	}
	
	public static void arraytd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows & columns");
		

		System.out.println("Enter the no. of Rows");
		
		int inputone = sc.nextInt();
		
		

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
				System.out.print(" "+arr1[i][j]+" ");
			}
			System.out.println();
			}	
		}
	
	public static void star() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<20;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void array() {
		int items[]  = new int[3];
		items[0]=10;
		items[1]=20;
		items[2]=30;
		System.out.println("The items mentioned are = ");
		for(int i=0;i<3;i++) {
			System.out.print(items[i]+" ");
		}
		
		
	}
	public static void arrayo() {
		String items[]=new String[3];
		items[0]="h";
		items[1]="harshal";
		items[2]="harshal";
		System.out.println("The items mentioned are = ");
		for(int i=0;i<3;i++) {
			System.out.print(items[i]+" ");
		}
	}
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
	
	
	public static void main(String[] args) {
		
		
		add(10,20);
		sub(20,10);
		System.out.println("The Multiplication is " + mul(10,10));
		System.out.println("The Division is " + div(10,10));
		arraytd();
		star();
		array();
		prime();
		arrayo();
	}
	
}
