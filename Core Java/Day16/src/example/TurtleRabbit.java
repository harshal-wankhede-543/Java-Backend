package example;

class Alphabets extends Thread{
	public void run() {
		for(char c='A';c<='Z';c++) {
			try {
				System.out.println("Turtle Prints = "+c);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Numbers extends Thread{
	public void run() {
		for(int i=1;i<=26;i++) {
			
			try {
				System.out.println("Rabbit Prints = "+i);
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class TurtleRabbit extends Thread{
	public static void main(String[] args) {
		Alphabets a = new Alphabets();
		Numbers n =new Numbers();
		
		a.start();
		n.start();
		
	}

}
