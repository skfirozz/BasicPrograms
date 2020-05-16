package Day11;

import java.util.Scanner;

public class DistinctTribles {
	static void tribles(int array[]) 
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						System.out.print(array[i]+" "+array[j]+"  "+array[k]);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=scan.nextInt();
		}
		scan.close();
		tribles(array);
	}
}
