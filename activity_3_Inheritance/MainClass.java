import java.util.Scanner;

class Vehicle{
	String make,vehicleNo,fuelType;
	int fuelCapacity, cc;
	
	Vehicle(String make, String vehicleNo, String fuelType, int fuelCapacity, int cc){
		this.make = make;
		this.vehicleNo = vehicleNo;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	void basicInfo() {
		System.out.println("***"+ make +"***");
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number: "+vehicleNo);
		System.out.println("Fuel Capacity: "+ fuelCapacity);
		System.out.println("Fuel Type: "+ fuelType);
		System.out.println("CC: "+cc);
		
	}
	
}

class TwoWheeler extends Vehicle{
	boolean kickStart;
	
	TwoWheeler(String a, String b, String c, int d, int e, boolean f){
		super(a,b,c,d,e);
		kickStart = f;
	}
	
	void display() {
		basicInfo();
		System.out.println("***Detail Information***");
		if(kickStart == true)
			System.out.println("KickStart Available: Yes");
		else
			System.out.println("KickStart Available: No");
	}
	
}

class FourWheeler extends Vehicle{
	String audioSystem;
	int noOfDoors;
	
	FourWheeler(String a, String b, String c, int d, int e, String f, int g){
		super(a,b,c,d,e);
		audioSystem = f;
		noOfDoors = g;
	}
	
	void display() {
		basicInfo();
		System.out.println("***Detail Information***");
		System.out.println("Audio System: "+audioSystem);
		System.out.println("No of Doors: "+noOfDoors);
	}
	
}


public class MainClass{
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		String make, vehicleNo, fuelType;
		int fuelCapacity, cc;
		
		System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
		int choice = s.nextInt();
		
		switch(choice) {
			
		case 1 : System.out.println("Vehicle Make:");
				 make = s.next();
				 
				 System.out.println("Vehicle Number:");
				 vehicleNo = s.nextLine();
				 System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
				 fuelType = s.nextLine();
				 System.out.println("Fuel Capacity:");
				 fuelCapacity = s.nextInt();
				 System.out.println("Engine CC: ");
				 cc = s.nextInt();
				 
				 String audioSystem;
				 int noOfDoors;
				 
				 System.out.println("Audio System:");
				 audioSystem = s.next();
				 System.out.println("Number of Doors:");
				 noOfDoors = s.nextInt();
				 
				 FourWheeler f = new FourWheeler(make, vehicleNo, fuelType, fuelCapacity, cc, audioSystem, noOfDoors);
				 
				 f.display();
				 break;
				 
		
		case 2 : System.out.println("Vehicle Make:");
				 make = s.next();
				 
				 System.out.println("Vehicle Number:");
				 vehicleNo = s.nextLine();
				 System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
				 fuelType = s.nextLine();
				 System.out.println("Fuel Capacity:");
				 fuelCapacity = s.nextInt();
				 System.out.println("Engine CC: ");
				 cc = s.nextInt();	 
				 
				 boolean kickStart;
				 System.out.println("Kick Start Available(True/False)");
				 kickStart = s.nextBoolean();
				 
				 TwoWheeler t = new TwoWheeler(make, vehicleNo, fuelType, fuelCapacity, cc,kickStart);
				 t.display();
		}
		s.close();
		
	}
	
}
