package Day10;

public class PrimeAnagram extends Prime1000 {
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
	public static void main(String[] args) {
		anagram();
	}

}
