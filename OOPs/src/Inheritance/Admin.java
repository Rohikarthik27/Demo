package Inheritance;

public class Admin extends Developer{
	
//	public void read(){
//		System.out.println("Read operation");
//	}
//	public void write() {
//		System.out.println("Write operation");
//	}
	
	public void manage() {
		
		super.read();//once provide the super class it will access the properties from the parent class
		write();
		System.out.println("Managing the application");
	}
	
	public void read() {
		System.out.println("Read from Admin class");
	}

}
