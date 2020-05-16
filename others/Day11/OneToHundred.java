package Day11;
public class OneToHundred {
	static void duplicate(int array[],int arrayD[])
	{
		int	value=0;
		for(int i=0;i<array.length;i++)
		{
			int count=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				count++;
				if(count>1)
				{
					value=i;
					break;
				}
			}
		}
		arrayD[0]=value;
//		System.out.println(array[value]);
	}
	public static void main(String[] args) {
		int arrayD[]=new int[1];
		int array[]=new int[100];
		duplicate(array, arrayD);
		System.out.println(arrayD[0]);
		
	}

}
