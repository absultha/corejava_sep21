package test;

public class Employee {
	protected int EmpId;
	public int Salary;
	String department;
	public Employee() {
		System.out.println("inside employee constructor");
	}public Employee(int empid,int salary){
		this.EmpId=empid;
		this.Salary=salary;
		
	}
	public void display() {
		System.out.println("Emp id is"+EmpId);
		System.out.println("Salary id is"+Salary);
		System.out.println("Dep id is"+department);
	}

}
