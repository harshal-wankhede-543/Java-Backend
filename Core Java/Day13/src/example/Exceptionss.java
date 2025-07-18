package example;

import java.util.Scanner;
public class Exceptionss {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Exceptions e = new Exceptions();
		e.one();
		Exceptions2 ee =new Exceptions2();
		ee.arrays();
		
	}
}
class Exceptions{
	
		public void one() {
			try {
				int arr1[] = {11,22,33,44,55,};
				System.out.print(arr1[12]);
			}catch(Exception e) {
				e.getMessage();
				e.getStackTrace();
				System.out.print(e.getMessage());
		}
	}
}
class Exceptions2{
	public void arrays() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("Enter a size of Array");
			int size = sc.nextInt();
			int arr1[] = new int[size];
			
			for(int i=0;i<size;i++) {
				System.out.println("Array index"+i);
				arr1[i]=sc.nextInt();
				
			}
			System.out.println("The array formed will be");
			for(int i=0;i<size;i++) {
				
				System.out.print(" ||"+"for index "+i+" ="+ arr1[i]);
			}
			System.out.println("");
			System.out.println("Now acces the index present in the Array");
			int input4 = sc.nextInt();
			if(input4<=size) {
				System.out.println("The value for your given input is "+arr1[input4]);
			}else {
				System.out.println("Please enter the valid Input");
			}
			
		}catch(Exception e) {
			e.getMessage();
			
		}
	}
}
