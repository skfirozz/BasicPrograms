package Day3H;

import java.util.Scanner;
import java.util.Random;
public class RollDie {
	void max(int array[])
	{
		int max=0,value=0;
		for(int i=0;i<array.length;i++) 
		{
			
			int count=0;
			for(int j=0;j<array.length;j++)
			{
				
				if(array[i]==array[j])
					count++;
				if(count>max)
				{
					max=count;
					value=i;
				}
			}
		}
		System.out.println("\n maximum times"+max+"  repeated value"+array[value]);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		scan.close();
		Random r=new Random();
		int array[]=new int[number];
		for(int i=0;i<number;i++)
		{
			array[i]=r.nextInt(6)+1;
			//System.out.print(array[i]+" ");
		}
		
		RollDie re=new RollDie();
		re.max(array);
		
		
	}

}
