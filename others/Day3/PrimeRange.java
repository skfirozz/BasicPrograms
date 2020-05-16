package Day3;

import java.util.Scanner;

public class PrimeRange {
	void range(int start,int last)
	{
		for(int i=2;i<=last;i++)
		{
			int count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0  )
				count++;
			}
			if(count==1 && i>=start)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int start=scan.nextInt();
		int last=scan.nextInt();
		scan.close();
		PrimeRange p=new PrimeRange();
		p.range(start, last);
		
	}
}
