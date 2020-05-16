package Day1;
public class KDW {
	public static void main(String[] args) {
		int n=10,temp=10-4;
		for(int i=1;i<=n/2;i++)
		{
			System.out.print("**");
			for(int j=1;j<=temp;j++)
			{
				System.out.print(" ");
			}
			temp=temp-2;
			System.out.println("**");
		}
		for(int i=n/2;i<n;i++)
		{
			temp=temp+2;	
			System.out.print("**");
			for(int j=1;j<=temp;j++)
			{
				System.out.print(" ");
			}
			System.out.println("**");
		}
		System.out.println("\n\n");
		int t1=n,t2=n;
		for(int i=1;i<=n;i++)
		{
			System.out.print("**");
			if(i==1)
			{
				for(int j=1;j<n;j++)
				System.out.print("*");
			}
			if(i>1 && i<n/2)
			{
				for(int k=t1;k>1;k--)
				{
					System.out.print(" ");
				}
			t1=t1+1;
					System.out.print("**");
			}
			if(i>n/2 && i<n)
			{
				for(int k=t2+2;k>1;k--)
				{
					System.out.print(" ");
				}
				t2=t2-1;
					System.out.print("**");
			}
			if(i==n)
				for(int j=1;j<n;j++)
				System.out.print("*");
				System.out.println();
		}
	}

	}
