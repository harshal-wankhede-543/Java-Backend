package com.classobj;

import java.util.Scanner;
class Practice1{
	
	public void Calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no you want to operate");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int input = sc.nextInt();
		
		for(int i=0;i<10;i++) {
			if(input==1){	
				System.out.print("Enter the no 1");
				int a= sc.nextInt();
				System.out.print("Enter the no 2");
				int b=sc.nextInt();
				int c=a+b;
				System.out.println("The addition is "+c);	
		}else {
			System.out.print("AAi ghal");
		}
		}
		
	}
}

public class Practice {
	public static void main(String[] args) {
		
		Practice1 p =new Practice1();
		p.Calculator();
		
	}
}
