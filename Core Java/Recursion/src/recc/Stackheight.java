package recc;


public class Stackheight {
	public static int stack(int x,int n) {
		if(n==0) {
			return 1;
		}
		if (x==0) {
			return 0;
		}
		
		int a = stack(x, n-1);
		int b = x *a;
		return b;
		
	}
	
	public static void main(String[] args) {
		int x=2;
		int n=5;
		int ans = stack(x,n);
		System.out.println(ans);
	}
} 
