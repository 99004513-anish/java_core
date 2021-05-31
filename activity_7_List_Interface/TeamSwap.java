import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class TeamSwap{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		ArrayList al = new ArrayList();
		String[] teams = new String[5];
		for(int i=0;i<5;i++) {
		
			teams[i] = s.next();
			al.add(teams[i]);
		}
		System.out.println("--------");
		for(int i=0;i<al.size();i++)
        {
            Object o = al.get(i);


            if(o instanceof String)

            System.out.println(o.toString());    
        }
		int swap1,swap2;
		System.out.println("Enter two swap position to swap the teams");
		swap1 = s.nextInt();
		swap2 = s.nextInt();
		Collections.swap(al,swap1,swap2);
		
		System.out.println("After Swap:");
		for(int i=0;i<al.size();i++)
        {
            Object o = al.get(i);


            if(o instanceof String)

            System.out.println(o.toString());    
        }
		
		
	}
}
