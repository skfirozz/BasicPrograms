package Day3H;

import java.util.Scanner;

public class SockMerchentSol {
	
	static void method(int array[])
	{
		int pairs=0;
		for(int i=0;i<array.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j]&& array[j] != 0 && array[i] != 0)
				{
					array[j]=0;
					count++;
				}
			}
			if(count>1)
			{
				pairs+=count/2;
			}
		}
		System.out.println(pairs);
		
		
		
	}	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int array[]=new int[number];
		for(int i=0;i<number;i++)
			array[i]=scan.nextInt();
		scan.close();
		method( array);
	}

}
