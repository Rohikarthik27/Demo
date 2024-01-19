package Encapsulation;

public class Student {
	
	private int rollno;
	private String name;
	private boolean attended;
	
	public Student(int rollnumber) {
		this.rollno=rollnumber;//this keyword can be used to refer current class instance variable.
	}
	
	public void studentattance(boolean flag) {
		if(flag) {
			attended=flag;
			System.out.println("Teacher assigned the attandance");
		
		}
		
	}
	
	public void getattandance() {
		System.out.println("Teacher accessed the student attandance");
	}



	
	
	
	 
}
