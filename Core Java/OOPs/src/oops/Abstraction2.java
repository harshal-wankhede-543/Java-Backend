package oops;
//Abstraction using the Interfaces

interface Animal{
	int eyes = 2; //this will be public and final by default 
	void walk();
}

interface Herbivore{
	
}

class Horse implements Animal,Herbivore{
	public void walk() {
		System.out.println("Walks on 4 legs");  //multiple inheritance with help of 
		                                        // interfaces
	}
}

public class Abstraction2 {
	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
		
	}

}
