package oops;

class Shape{
	public void area() {
		System.out.println("Displays area");
		
	}
}
class Triangle extends Shape{
	public void area(int l,int h) {
		System.out.println(1/2*l*h); //Single level inheritance
	}
}
class Equilateraltriangle extends Triangle{
	public void area(int l,int h) {
		System.out.println(1/2*l*h); //Multi-level Inheritance
	}
}
class Circle extends Shape{
	public void area(int r) {
		System.out.println(3.14*r*r); //Hierarchial Inheritance
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		Circle c= new Circle();
		c.area(10);
		
	}
}
