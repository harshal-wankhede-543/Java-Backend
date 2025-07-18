package abs;
import java.util.Scanner;

abstract class Animal{
	public abstract void eats();
}

abstract class Bird{
	public abstract void fly();
}

class Horse extends Animal{
	public void eats() {
		System.out.println("They eat Grass");
	}
}

class Tiger extends Animal{
	public void eats() {
		System.out.println("They eat meat ");
	}
}

class Pigeon extends Bird{
	public void fly() {
		System.out.println("It flys very high");
	}
}
class Ostrich extends Bird{
	public void fly() {
		System.out.println("it cannot fly ");
	}
}
class Legs extends Ostrich{
	public void legs() {
		System.out.println("It has two legs ");
	}
}

public class Abstractionss extends Animal {
	Scanner sc = new Scanner(System.in);
	public void eats() {
		System.out.println("Here are the list of animals ");
	}
	
	int input = sc.nextInt();
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the no which you want to select = ");
		System.out.println("1.Horse ");
		System.out.println("2.Tiger ");
		System.out.println("3.Pigeon");
		System.out.println("4.Ostrich");
		
		int input= sc.nextInt();
		if(input==1) {
			Horse h =new Horse();
			h.eats();
		}else if (input==2){
			Tiger t = new Tiger ();
			t.eats();
		}else if(input==3){
			Pigeon p =new Pigeon();
			p.fly();
		}else if(input==4) {
			Legs l =new Legs();
			l.legs();
		}
		
		
	} 
}
