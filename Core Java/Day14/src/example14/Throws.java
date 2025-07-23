package example14;
import java.util.Scanner;

public class Throws {
	public static void main(String[] args) {
		Main m =new Main();
		m.arithmenticException();
		
	}
	
}

class  Main{
	public void arithmenticException(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age = ");
		int age = sc.nextInt();
		if(age<0) {
			throw new ArithmeticException("age is invaild");
		}else {
			System.out.println("The age is valid");
			try {
				System.out.println("Is the age above 110");
				int age2=sc.nextInt();
				if(age2>110) {
					throw new ArithmeticException("Too much age,goo sleep ");
				}
			}catch(Exception e) {
				e.getMessage();
				e.getStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
