package example;
import java.util.Scanner;

public class Threadsshw extends Thread{
	public void run() {
		System.out.println("providing the numbers from 1-10");
		for(int i=0;i<10;i++) {
			System.out.println(i+1);
		}
	}
	public void evenodd(){
		Scanner sc = new Scanner(System.in);
		System.out.println("What do want to print = 1-even || 2- odd");
		int input1 = sc.nextInt();
		if(input1==1) {
			for(int i=0;i<20;i=i+2) {
				System.out.print(" "+i);
			}
		}else if(input1==2) {
			for(int i=1;i<20;i=i+2) {
				System.out.print(" "+i);
			}
		
		}else {
			System.out.println("no such input");
		}
	}
	public void delay() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void timer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Countdown Timer");
		int input2 = sc.nextInt();
		System.out.println("Your Countdown Timer begins ");
		for(int i=input2;i>=0;i--) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Threadsshw th =new Threadsshw();
//		th.start();
//		th.evenodd();
//		th.delay();
		th.timer();
	}

}
