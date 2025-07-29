package practice;
import java.util.*;



public class Manage {
	
	public void add() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of input you ant to add");
		int input1 = sc.nextInt();
		int arr1[] = new int[input1];
		
		for(int i=0;i<input1;i++) {
			System.out.println("item = "+i);
			arr1[i]=sc.nextInt();
			
		}
		System.out.println("The values stored are");
		for(int i=0;i<input1;i++) {
			
			System.out.print(" "+ arr1[i]);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Manage m = new Manage();
//		m.add();
		
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the items you want to add = ");
		int input2 = sc.nextInt();
		for(int i =1;i<=input2;i++) {
			
			System.out.println("Enter the Strings for " + (i));
			String name = sc.next();
			arr.add(name);
		}
		System.out.println(arr);
		
		System.out.println("Now the items are added successfully");
		System.out.println("Enter what changes you want to provide");
		System.out.print("1.update ");
		System.out.print("2.get ");
		System.out.print("3.clear ");
		System.out.print("4.remove");
		int input3 = sc.nextInt();
		if(input3==1) {
			System.out.println(arr);
			System.out.println("Which index you want to change");
			
			int changeINT = sc.nextInt();
			System.out.println("Provide the change");
			String change = sc.next();
			
			arr.set(changeINT, change);
			System.out.print(arr);
			
		}else if (input3==2) {
			System.out.println("Which value you want to get = ");
			int input4 = sc.nextInt();
			System.out.println(arr.get(input4));
			
		}else if(input3==3){
			System.out.println(" Sure your entire values will be removed");
			arr.clear();
			System.out.println(arr);
		}else if(input3==4) {
			System.out.println(" Ehich values to be removed");
			int input5=sc.nextInt();
			arr.remove(input5);
			System.out.print(arr);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
