package fff;

public class Final extends Ball{
	final int num3=12;
	final void three() {
		final int num3=15;
		System.out.println(num3);
	}
	
	public static void main(String[] args) {
		final int num2=12;
		Apple a = new Apple();
		a.one();
		Ball b =  new Ball();
		b.two();
		Final f = new Final();
		f.three();
		System.out.println(f.num3);
		Cat c = new Cat();
		c.three();
	}
	
}

final class Apple {
	final void one() {
		int num1=10;
		System.out.println(num1);
		
		
	}
}
class Ball{
	public void two() {
		final int num2=11;
		System.out.println(num2);
	}
}

class Cat{
	final void three() {
		final int num3=14;
		System.out.println(num3);
		
	}
}