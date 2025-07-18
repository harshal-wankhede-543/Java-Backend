package oops;


class Polymorphism1{
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);	         // printInfo is doing Polymorphism
	}
	public void printInfo(String name,int age) {
		System.out.println(name+" "+age);
	}


}

public class Polymorphism {
	public static void main(String[] args) {
		Polymorphism1 p1=  new Polymorphism1();
		p1.name="harsh";
		p1.age=21;
		
		p1.printInfo(p1.name,p1.age);
		
	}
}
