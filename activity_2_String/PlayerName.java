import java.util.Scanner;

public class PlayerName{
	public static void main(String args[]) {
		String str1,str2,delimiter;
		String[] temp1;
		String[] temp2;
		
		Scanner s = new Scanner(System.in);
		str1 = s.nextLine();
		str2 = s.nextLine();
		delimiter =" ";
		temp1 = str1.split(delimiter);
		temp2 = str2.split(delimiter);
		str1 = temp1[1];
		str2 = temp2[1];
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.equals(str2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		s.close();
	}
}
