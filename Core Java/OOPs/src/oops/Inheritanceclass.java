package oops;

import java.util.*;

interface Sum{
	void sum();
}
interface Substraction{
	 void sub();
	 void multiply();
 }
interface Evenodd{
	void guess();
}
interface Checkmarks {
	void marks();
}
class Reels{
	String name;
	String Content;
}
class DurgeshNai extends Reels{
	String name1;
	String Content2;
	public void reel(String name1,String Content2) {}
	String name = name1;
	String Content = Content2;
}
class Operation extends Reels implements Sum,Substraction,Evenodd{
	Scanner sc =new Scanner(System.in);
	public void sum() {
		System.out.println("Enter the Numbers to Sum");	
		int input1 = sc.nextInt();
		int no1= input1;
		int input2 = sc.nextInt();
		int no2=input2;
		int no3 =no1 +no2 ;
		System.out.println("The addition of the two no is = "+ no3);	
		
	}
	public void sub() {
		System.out.println("Enter the Numbers to Substract");	
		int input1 = sc.nextInt();
		int no1= input1;
		int input2 = sc.nextInt();
		int no2=input2;
		int no3 =no1 -no2 ;
		System.out.println("The Substraction of the two no is = "+ no3);
	}
	public void multiply() {
		System.out.println("Enter the Numbers to Multiply");	
		int input1 = sc.nextInt();
		int no1= input1;
		int input2 = sc.nextInt();
		int no2=input2;
		int no3 =no1 * no2 ;
		System.out.println("The Multiplication of the two no is = "+ no3);
	}
	public void guess() {
		System.out.println("Enter the no to check the no is even or odd ?");
		int input3 =sc.nextInt();
		if(input3%2==0) {
			System.out.println("The no is even");
		}else {
			System.out.println("The no is odd");
		}
		
	}
	public void marks() {
		System.out.println("Enter the name of Subject of which you want to see the marks=");
		String input4 =sc.nextLine();
		if(input4.equalsIgnoreCase("English")||input4.equals("english")){
			System.out.println("Your english marks are 99");
		}else if(input4.equals("Maths")||input4.equals("maths")){
			System.out.println("Your Maths marks are 89");
		}else {
			System.out.println("No such subjects ,kindly check correctly");
		}
		
	}
	
}

public class Inheritanceclass {
	
	public static void main(String[] args) {
		Operation op =new Operation();
		op.sum();
		op.sub();
		op.multiply();
		op.guess();
		op.marks();
		DurgeshNai dj = new DurgeshNai();
		dj.reel("DurgeshNai", "Comedy");
		System.out.println(dj.Content);
	}

}
