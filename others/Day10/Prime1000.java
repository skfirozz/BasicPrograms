package Day10;

public class Prime1000 {
	public static int array[]=new int[168];
	public static void prime()
	{	int c=0;
		for(int i=2;i<=1000;i++)
		{
			int count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0  )
				count++;
			}
			if(count==1 && i>=2)
			{	
				array[c]=i;
				c++;
			}
		}
	}
	public static int tempArray[]=new int[168];
	public static void anagram()
	{
		int c=0;
		for(int i=0;i<array.length;i++)
		{
			int temp=array[i];
			int finValue=0;
			while(temp !=0)
			{
				int t=temp%10;
				temp=temp/10;
				finValue=finValue*10+t;
			}
			for(int j=0;j<array.length;j++)
			{
				if(finValue>11 && finValue==array[j])
				{
					c++;
					System.out.print(array[j]+" ");
				}
			}
		}
		System.out.println("\n"+c);
	}
	
	static void palindrom()
	{
		for(int i=0;i<array.length;i++)
		{
			int temp=array[i];
			int value=0;
			while(temp != 0)
			{
				int r=temp%10;
				 value=value*10+r;
				 temp=temp/10;
			}
			if(value==array[i])
				System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		prime();
		anagram();
		palindrom();
	}

}
