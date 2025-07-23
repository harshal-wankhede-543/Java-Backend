package example14;
import java.util.Scanner;

class InvalidMarksException extends Exception {
	public InvalidMarksException(String msg) {
		super(msg);
	}
}

public class Throwss {
	Scanner sc =new Scanner(System.in);
	int marks =sc.nextInt();
	
	public static void checkmarks(int marks) throws InvalidMarksException{
	
		
		if(marks<0 || marks >100) {
			throw new InvalidMarksException("Provide the valid marks");
		}else {
			System.out.println("The marks are valid");
		}
	}
	public static void main(String[] args) {
	
		try {
			checkmarks(110);
		}catch(InvalidMarksException e) {
			e.getMessage();
			System.out.println(e.getMessage());
			
		}
		
	}
}
