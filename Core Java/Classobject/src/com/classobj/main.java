package com.classobj;
import com.classobj.Star;
import com.classobj.Even;
import com.classobj.oddeven;
import com.classobj.Prime;
import com.classobj.Ifelse;
class Addition{
	public void add() {
		int a=10;
		int b=30;
		int c = a+b;
		System.out.print("The addition is " + c);
		
	}
}

public class main {
	public static void main(String[] args) {
//		Addition a = new Addition();
//		a.add();
//		System.out.println();
//		Star s = new Star();
//		s.loops();
//		Even e = new Even();
//		e.even();
		oddeven od = new oddeven();
		od.odd();
		Prime pm = new Prime();
		pm.prime();
		Ifelse ip = new Ifelse();
		ip.ifelse();
		
	}

}
