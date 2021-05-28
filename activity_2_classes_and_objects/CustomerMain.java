import java.util.Scanner;

class Customer{
	
	private String name,addr,mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}



public class CustomerMain{
	public static void main(String args[]) {
		String input,a;
		String name,addr,mobile;
		Scanner s = new Scanner(System.in);
		Customer c = new Customer();
		
		System.out.println("Enter the details: ");
		input = s.nextLine();
		String delimiter = ",";
		String[] temp;
		
		temp = input.split(delimiter);
		
		name = temp[0];
		addr = temp[1];
		mobile = temp[2];
		
		c.setName(name);
		c.setAddr(addr);
		c.setMobile(mobile);
		
		System.out.println("\nName: "+c.getName());
		System.out.println("Address: "+c.getAddr());
		System.out.println("Mobile: "+c.getMobile());
		
	}
	
}
