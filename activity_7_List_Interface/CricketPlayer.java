import java.util.Scanner;
import java.util.ArrayList;

public class CricketPlayer{
	public static void main(String args[]) {
		
		String player_name,country,skill;
		int age,position;
		ArrayList<Object> al = new ArrayList<Object>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the player details");
		System.out.println("Enter player name:");
		player_name = s.nextLine();
		
		System.out.println("Enter age:");
		age = s.nextInt();
		
		System.out.println("Enter country:");
		country = s.next();
		
		
		al.add(player_name);
		al.add(age);
		al.add(country);
		System.out.println("Player Details");
		for(int i=0;i<al.size();i++)
        {
            Object o = al.get(i);


            if(o instanceof String || o instanceof Integer)

            System.out.println(o.toString());    
        }
		
		System.out.println("Enter Skill:");
		skill = s.next();
		System.out.println("Enter hte position to add skill:");
		position = s.nextInt();
		al.add(position, skill);
		for(int i=0;i<al.size();i++)
        {
            Object o = al.get(i);


            if(o instanceof String || o instanceof Integer)

            System.out.println(o.toString());    
        }
		
		System.out.println("Enter the position of the detail to be removed:");
		position = s.nextInt();
		al.remove(position);
		for(int i=0;i<al.size();i++)
        {
            Object o = al.get(i);


            if(o instanceof String || o instanceof Integer)

            System.out.println(o.toString());    
        }
		
		
		s.close();
		
	}
}