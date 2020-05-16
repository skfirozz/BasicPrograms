package Day5H;
import java.util.Scanner;
public class ArrayMinMax {
	public static int minMax(int array[])
	{
		int min=array[1],max=0;
		for(int i=0;i<array.length;i++)
		{
			if(min > array[i])
				min=array[i];
			
			if(max < array[i])
				max=array[i];
		}
		System.out.println(min+"  "+max);
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int array[]=new int[number];
		for(int i=0;i<number;i++)
			array[i]=scan.nextInt();
		scan.close();
		System.out.println(minMax(array));
	}
	

}
