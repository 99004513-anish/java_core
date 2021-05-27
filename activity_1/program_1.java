import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		n= s.nextInt();
		
		if(n < 0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int arr[] = new int[n];
		
		int i;
		for(i=0;i<n;i++) {
			arr[i] = s.nextInt();
			if(arr[i] < 0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
			
		}
		int x;
		x = s.nextInt();
		
		
		int result = findElementCount(arr,n,x);
		System.out.println(result);
		
		s.close();
	}
	
	public static int findElementCount(int a[], int size, int key) {
		
		int j,count=0;
		for(j=0;j<size;j++) {
			if(a[j] == key)
			{
				count++;
			}
		}
		return count;
}

}