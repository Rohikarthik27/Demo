package Abstraction;

//Abstract is a non-Access modifier.

public abstract class HP implements Laptop_abstraction{

	
	//Implemented methods
	@Override
	public void copy() {
		// TODO Auto-generated method stub
		
		System.out.println("HP copy code");
		
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("HP Paste code");
		
	}

	//Un-implemented methods
	
	public abstract void cut();
	
	public abstract void keyboard();
	
	

}
