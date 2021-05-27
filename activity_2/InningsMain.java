
import java.util.Scanner;

class Innings{
	private String teamName, inningsName;
	private int runs;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		
		this.teamName = teamName;
	}

	public String getInningsName() {
		
		if(inningsName.equals("First")) {
			int run = runs+1;
			return "Need " + run + " to win";
		}
		else
			return "Match Ended";
		
	}

	public void setInningsName(String inningsName) {
		
		this.inningsName = inningsName;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		
		this.runs = runs;
	}
	
	
}

public class InningsMain{
	public static void main(String args[]) {
		
		String teamname,inningsname;
		int runs;
		
		Innings i = new Innings();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the team name:");
		teamname = s.nextLine();
		System.out.println("Enter session:");
		inningsname = s.nextLine();
		System.out.println("Enter runs: ");
		runs = s.nextInt();
		i.setTeamName(teamname);
		i.setInningsName(inningsname);
		i.setRuns(runs);
		
		System.out.println("Name: " +i.getTeamName());
		System.out.println("Scored: "+i.getRuns());
		System.out.println(i.getInningsName());
		
		s.close();
		
		
	}
}
