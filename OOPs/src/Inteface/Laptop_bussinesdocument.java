package Inteface;

public interface Laptop_bussinesdocument {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void security() {
		System.out.println("using default keyword");
	}
	
	static void cpu() {
		System.out.println("Using static keyword");
	}
	

}
