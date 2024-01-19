package Polymorphism;

public class calculation {
	
	//method overloading
	public int add(int a,int b) {
		System.out.println();
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		System.out.println();
		
		return a+b+c;
	}
	
	public double add(double a,double b) {
		return a+b;
		
	}
	
	public static void main(String[] args) {
		calculation cal=new calculation();
		System.out.println(cal.add(2, 4));
		
	}

}
