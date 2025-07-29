package sxample;
import java.util.*;
public class Queuea {
	public static void main(String[] args) {
		Queue<String> qq = new LinkedList<>();
		qq.add("Harshal");
		qq.add("Bala");
		qq.add("Kala");
		qq.remove("Kala");
		System.out.println(qq);
	}
}
