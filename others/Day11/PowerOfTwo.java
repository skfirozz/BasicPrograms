package Day11;

import java.util.Scanner;

public class PowerOfTwo {
	public static void powerOfTwo(int array[],int number)
	{
		int value=1;
		for(int i=0;i<number;i++)
		{
			value=value*2;
			array[i]=value;
		}
		int count=0;
		for(int i=0;i<number;i++)
		{
			if(array[i] < 10)
			{
				count++;
				System.out.println("units  "+array[i]);
			}
			else break;
		}
		for(int i=count;i<number;i++)
		{
			if(array[i] < 100 && array[i] >= 10)
			{
				count++;
				System.out.println("tens  "+array[i]);
			}
			else break;
		}
		for(int i=count;i<number;i++)
			if(array[i] >= 100 && 1000>array[i])
			{
				count++;
				System.out.println("hundreds  "+array[i]);
			}
			else break;
		for(int i=count;i<number;i++)
			if(array[i] >= 1000 && 100000>array[i])
			{
				count++;
				System.out.println("thousands  "+array[i]);
			}
			else break;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int array[]=new int[number];
		scan.close();
		powerOfTwo(array, number);
	}

}
