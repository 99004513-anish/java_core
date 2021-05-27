import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		n= s.nextInt();
		
		int arr[] = new int[n];
		int i;
		for(i=0;i<n;i++) {
			arr[i] = s.nextInt();
			if(arr[i]<0)
			{
				System.out.println("Invalid Score");
				System.exit(0);
			}
		}
		
		int score = s.nextInt();
		if(score < 0)
		{
			System.out.println("Invalid Score");
			System.exit(0);
		}
		cricket(arr,n,score);
		s.close();
	}	
	
	static void cricket(int a[], int n, int score)
	{
		int i;
		for(i=1;i<n;i+=2) {
			if(a[i] > score)
			{
				System.out.println(a[i-1]);
			}
		}
	}
	

}

