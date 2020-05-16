import java.util.Scanner;

import Soriting.Bubble_Sort;

public class BubbleSort {

	void bubble_sort(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int length=scan.nextInt();
		int array[]=new int[length];
		for(int i=0;i<length;i++)
			array[i]=scan.nextInt();
		scan.close();
		BubbleSort b=new BubbleSort();
		b.bubble_sort(array);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
	}
}
