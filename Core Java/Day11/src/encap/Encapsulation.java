package encap;
import java.util.Scanner;

class Data{
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSerial() {
		return serial;
	}
	public void setSerial(double serial) {
		this.serial = serial;
	}
	private double serial;
	
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name=Name;
	}
}

class Vote{
	
	private String names;
	private int age1;
	private String Area;
	
	public int setAge(int age){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please Enter your age for verification ");
		age = sc.nextInt();
		if(age>18) {
			System.out.println("You are eligible ");
		}else {
			System.out.println("You are not eligible ");
		}
		return age;
	}
	public void getAge(int age) {
		this.age1=age;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Data d = new Data();
		d.setName("Chiku");
		d.setAge(10);
		d.setSerial(11.11);
		
		Vote v = new Vote();
		v.setAge(18);
		v.getAge(18);
		
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getSerial());
		System.out.println(d.getAge());
	}
	
	

}
