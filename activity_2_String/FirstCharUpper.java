import java.util.Scanner;

public class FirstCharUpper{
	public static void main(String args[]) {
		
		String temp,fname,sname,rem;
		Scanner s = new Scanner(System.in);
		
		fname = s.nextLine();
		sname = s.nextLine();
		
		temp = fname.substring(0,1);
		
		rem = fname.substring(1,fname.length());
		rem = rem.toLowerCase();
		
		temp = temp.toUpperCase();
		fname = temp + rem;
		
		sname = sname.toUpperCase();
		
		System.out.println(fname +" "+ sname );
		s.close();
		
	}
}