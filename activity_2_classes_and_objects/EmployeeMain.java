import java.util.Scanner;
class Employee{
	private String name,addr,mobile;
	Scanner s = new Scanner(System.in);
	public void setDetails() {
		System.out.println("Enter th name:");
		name = s.nextLine();
		System.out.println("Enter Address:");
		addr = s.nextLine();
		System.out.println("Enter Mobile:");
		mobile = s.nextLine();
	}
	public void getDetails() {
		System.out.println("Employee Details");
		System.out.println("Name: "+name);
		System.out.println("Address: "+addr);
		System.out.println("Mobile: "+mobile);
	}
	
	
}

public class EmployeeMain{
	
	public static void main(String args[]) {
		
		Employee e = new Employee();
		
		e.setDetails();
		e.getDetails();
	}
}
