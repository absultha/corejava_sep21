package test;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1=new Employee();
emp1.EmpId=6789;
emp1.Salary=7000;
emp1.department="technology";
emp1.display();
Employee emp2=new Employee(5678,8965);
emp2.display();
	}

}
