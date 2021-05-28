import java.util.Scanner;

class Company{
	private String name,employees,teamlead;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	public String getTeamlead() {
		return teamlead;
	}

	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	
	
}

public class CompanyMain{
	public static void main(String args[]) {
		
		Company c = new Company();
		Scanner s = new Scanner(System.in);
		String name,employees,teamlead;
		System.out.println("Enter the Company name: ");
		name = s.nextLine();
		System.out.println("Enter the employees: ");
		employees = s.nextLine();
		String delimiter = ",";
		String[] temp = employees.split(delimiter);
		System.out.println("Enter TeamLead: ");
		teamlead = s.nextLine();
		int len = temp.length;
		int i,flag=0;
		for(i=0;i<len;i++) {
			if(teamlead.equals(temp[i]))
			{
				c.setName(name);
				c.setEmployees(employees);
				c.setTeamlead(teamlead);
				flag=1;
				
			}
			
		}
		if(flag == 0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		System.out.println("Name: "+c.getName());
		System.out.println("Employees: "+c.getEmployees());
		System.out.println("Lead: "+c.getTeamlead());
		
		s.close();
		
	}
}
