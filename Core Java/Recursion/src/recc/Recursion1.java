package recc;

public class Recursion1 {
	public static void printNumb(int n) {
		if(n==0) {
			return;        //for decreasing value
		}
		System.out.println(n);
		printNumb(n-1);
	}
	public static void printNumb1(int m) {
		if(m==6) {
			return;
		}
		System.out.println(m);           // for increasing value
		printNumb1(m+1);
	}
	
	public static void main(String[] args) {
		int n = 5;
		printNumb(n);
		
		int m =1;
		printNumb1(m);
	}
}
