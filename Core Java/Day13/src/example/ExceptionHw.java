package example;

import java.util.Scanner;

class Exception1{
	public void operate() {
		try {
			System.out.println("Provide the input in the form of numbers = ");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			Scanner sc = new Scanner(System.in);
			
			int input = sc.nextInt();
			
			if(input==1) {
				System.out.println("Provide the two numbers");
				System.out.println("Enter the first number = ");
				int input1=sc.nextInt();
				System.out.println("Enter the second Number = ");
				int input2 = sc.nextInt();
				int input3=input1+input2;
				System.out.println("The additioon of the two numbers is ="+input3);
			}else if(input==2) {
				System.out.println("Provide the two numbers");
				System.out.println("Enter the first number = ");
				int input1=sc.nextInt();
				System.out.println("Enter the second Number = ");
				int input2 = sc.nextInt();
				int input3=input1-input2;
				System.out.println("The substraction of the two numbers is ="+input3);
			}else if(input==3){
				System.out.println("Provide the two numbers");
				System.out.println("Enter the first number = ");
				int input1=sc.nextInt();
				System.out.println("Enter the second Number = ");
				int input2 = sc.nextInt();
				int input3=input1*input2;
				System.out.println("The multiplication of the two numbers is ="+input3);
			}else if(input==4){
				System.out.println("Provide the two numbers");
				System.out.println("Enter the first number = ");
				int input1=sc.nextInt();
				System.out.println("Enter the second Number = ");
				int input2 = sc.nextInt();
				int input3=input1/input2;
				System.out.println("The division of the two numbers is ="+input3);
			}else {
				System.out.println("Provide the correct input");
			}
			
		}catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}

public class ExceptionHw {
	public static void main(String[] args) {
		Exception1 ee =new Exception1();
		ee.operate();
		
		
	}
}
