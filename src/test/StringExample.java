package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String FName="munnu";
 String LName="Buddi";
 String FullName=FName+" "+LName;
 System.out.println("Full name is"+ FullName);
 System.out.println("Length of Full name is"+FullName.length());
 System.out.println("Name in upper case"+ FullName.toUpperCase());
 String NewName=FullName.replace(" ",",");
 System.out.println("New Name is" +NewName);
	}
}
