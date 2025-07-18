package oops;

class pen{
	String color;
	String type; //ballpen or gelpen
	
	public void write() {
		System.out.println("Writing Something");
	}
	
	public void printcolor() {
		System.out.println(this.color);
	}
	
}
class Student{
	String name;
	int age;
	
	public void printInfo() {
	System.out.println(this.name);
	System.out.println(this.age);
	}
//	Student(){
//		System.out.println("Non parameterised Constructor called ");
//	}
//	Student(String name,int age){
//		this.name=name;           //parameterized constructor
//		this.age=age;
//		}
	Student(Student s2){
		this.name=s2.name;
		this.age=s2.age;
	}
	Student(){
		
	}
	}

public class classandobj {
	
	public static void main(String[] args) {
//		pen pen1 = new pen();
//		pen1.color="blue";
//		pen1.type = "gel";
//		pen1.write();
//		pen pen2 = new pen();
//		pen2.color ="black";
//		pen2.type = "ball";
//		pen1.printcolor();
//		pen2.printcolor(); 
//		
//		Student student1 = new Student();
//		student1.name="Harshal";
//		student1.age=21;
//		
//		Student student2=new Student();
//		student2.name="aman";
//		student2.age=11;
//		
//		student1.printInfo();
//		student2.printInfo();
		
		Student s1=  new Student();
		s1.name="harsah";
		s1.age=21;
		
		Student s2=new Student(s1);   //copy Constructor of s1 
		s2.name="aman";
		s2.printInfo();
		
//		
		
	}

}
