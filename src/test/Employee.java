package test;

public class Employee extends Person {
	protected int EmpId;
	public int Salary;
	static String department="technology";
	public Employee() {
		super();
		System.out.println("inside employee constructor");
		
	}

		public Employee(int empid,int salary){
	
		this();
		this.EmpId=empid;
		this.Salary=salary;
		
		
	}
		public Employee(String name,int age,String  city,int empid,int salary){
			
			super(name,age,city);
			this.EmpId=empid;
			this.Salary=salary;
			
			
		}
		public void display() {
			super.display();
			System.out.println("Emp id is"+EmpId);
			System.out.println("Salary id is"+Salary);
			System.out.println("Dep id is"+Employee.department);
		}

}
