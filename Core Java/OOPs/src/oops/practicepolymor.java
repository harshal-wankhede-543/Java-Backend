package oops;



class pen1{
	String name;
	String company;
	int size;
	int length;
	
	public void base(String name,String company) {
		this.name=name;
		this.company=company;
		System.out.println(name+" "+size);		
	}
	public void base(int size,int length) {
		this.size=size;
		this.length=length;
	}
}
class pen2 extends pen1{
	public void detail() {
		this.name="Harshal";
		System.out.println(name);
	}
}

class Pens{
	public static void main(String[]args) {
		pen1 pc =new pen1();
		pc.name="Chiku";
		pc.company="Reynolds";
		
		pc.base(pc.name,pc.company);
		
		pen2 p2 = new pen2();
		p2.detail();
	}
}
