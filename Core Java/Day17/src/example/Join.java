package example;
import java.util.*;


public class Join extends Thread{
	public void t1() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int arr1[]=new int[5];
		arr1[0]=10;
		arr1[1]=10;
		arr1[2]=10;
		arr1[3]=10;
		arr1[4]=10;
		for (int i=0 ; i<=4;i++) {
			System.out.print(arr1[i]);
		}
		
	}
	public void t2() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int arr1[]=new int[5];
		arr1[0]=20;
		arr1[1]=20;
		arr1[2]=20;
		arr1[3]=20;
		arr1[4]=20;
		
		for (int i=0 ; i<=4;i++) {
			System.out.print(arr1[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Join j =new Join();
		j.t1();
		try {
			
			j.join();
		}catch(Exception e) {
			e.fillInStackTrace();
			e.getMessage();
		}
		j.t2();
	}
}
