package example;
import java.util.*;
public class CollectionArray {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Harshal");
		arr.add("Chikku");
		arr.add("Mahhe");
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr);
		arr.set(1, "lasmds");
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr);
		
		Stack <String> s= new Stack<>();
		s.push("H");
		s.push("a");
		s.push("r");
		s.push("s");
		s.push("h");
		s.push("a");
		s.push("l");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
	}
}
