package Day8;

import java.util.Scanner;

public class BubbleSort {
	public static void bubble(int array[])
	{
		for(int i=0;i<array.length-1;i++)
		{
				if(array[i] > array[i+1])
				{
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
		}
		for(int i=0;i<array.length-1;i++)
			if(array[i]>array[i+1])
			{
				bubble(array);
			}
//		if(n >=0)
//		bubble(array, n-1);
	}
	static int array[]=new int[10];
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<array.length;i++)
			array[i]=scan.nextInt();
		scan.close();
		bubble(array);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}

}
