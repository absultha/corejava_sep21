package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowsExample obj=new ThrowsExample();

	obj.calculator();

	}
public void calculator(){
	
	try {
		add();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
public void add() throws InterruptedException {
	System.out.println("inside add");
	
}
}
