package Day3H;
import java.util.Scanner;
public class newsadd {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter t:");
		int t=sc.nextInt();
		for (int i = 0; i < t ; i++) {
			System.out.println("enter n:");
			int n=sc.nextInt();
			System.out.println("enter k:");
			int k=sc.nextInt();
			System.out.println("enter values:");
            int[] arr=new int[n];
			int count=0;
            for (int j = 0; j < n; j++) {
				arr[j]=sc.nextInt();
				if(arr[j]>=0)
					count++;
			}
            if(count>=k)
            	System.out.println("YES");
            else 
            	System.out.println("NO");
		}
		sc.close();	
	}
}

