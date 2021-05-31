import java.util.Scanner;
import java.util.ArrayList;

public class CommonPlayers{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		String[] players = new String[5];
		
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for(int i=0;i<5;i++)
		{
			players[i] = s.nextLine();
			list1.add(players[i]);
		}
		
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++)
		{
			players[i] = s.nextLine();
			list2.add(players[i]);
		}
		
		ArrayList<String> list3 = new ArrayList<String>(list1);
		list3.retainAll(list2);
		
		System.out.println("Consistent Run Scorers:");
		for(int i=0;i<list3.size();i++)
        {
            Object o = list3.get(i);


            if(o instanceof String)

            System.out.println(o.toString());    
        }
		s.close();
		
	}
}
