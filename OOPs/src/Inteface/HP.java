package Inteface;

public class HP implements Laptop_bussinesdocument{

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

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("HP cut code");
		
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("HP keyboard code");
		
	}
	
	public void camera(){
		System.out.println("Buit in camera provided");
	}
	
	public void security() {
		System.out.println("Security in HP class");
	}

}
