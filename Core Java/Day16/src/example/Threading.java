package example;

import java.util.Scanner;
public class Threading extends Thread {
	
	public void t1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		for(int i=0;i<size;i++) {
			
			System.out.println("Insert the value for Index "+ i);
			arr1[i] = sc.nextInt();
			
		}
		System.out.println("The final output is provided below = ");
		for(int i=0;i<size;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println ("The output for index "+i+" is "+arr1[i]);
		}
		
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hello");
		}
	}
	Threading(){
		System.out.print("Following is the example of dynamic array with Threading = ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Threading t =new Threading();
		t.t1();
		t.start();
	} 
}
