package Day12;

import java.util.Scanner;

public class g {
	static void doing(int array[],int start,int end)
	{
		int c=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] >start && array[i] <end)
				c++;
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i] >start && array[i] <end && c > 0)
			{
				System.out.print(array[i]+" ");
				c--;
			}
			else if(array[i] >start && array[i] <end && c==0)
				System.out.print(array);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int start=scan.nextInt();
		int end=scan.nextInt();
		int array[]=new int[number];
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		scan.close();
		doing(array, start, end);
	}
}
