package oops;

class Penss{
	String name;
	String company;
	int size;
	int length;
	
	public void base(String name,String company) {
		this.name=name;
		this.company=company;
		System.out.println(name+" "+company);		
	}
	public void base(int size,int length) {
		this.size=size;
		this.length=length;
	}
}

class Pens1{
	public static void main(String[]args) {
		Penss pc =new Penss();
		pc.name="Chiku";
		pc.company="Reynolds";
		
		pc.base(pc.name,pc.company);
	}
}
