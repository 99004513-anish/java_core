import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ChrisGayleScore{
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> score = new ArrayList<Integer>();
		
		int n = s.nextInt();
		int[] scores = new int[n];
		
		for(int i=0;i<n;i++) {
			scores[i] = s.nextInt();
			score.add(scores[i]);
		}
		int count_fifty=0;
		int count_hundred=0;
		Iterator<Integer> itr = score.iterator();
        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if (x < 100) {
                if(x >= 50)
                	count_fifty++;
            }
            else if(x >= 100) {
            	count_hundred++;
            }
        }
            
		System.out.println(count_fifty);
		System.out.println(count_hundred);
		s.close();
	}
}
