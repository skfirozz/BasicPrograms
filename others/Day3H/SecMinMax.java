package Day3H;
import java.util.Scanner;
public class SecMinMax {
	void minMax(int array[])
	{
		int min=100,max=0;
		for(int i=0;i<array.length;i++)
		{
			 if(array[i] < min)
				 min=array[i];
			 
			 if(array[i] > max)
				max=array[i];
		}
		int min2=max,max2=min;
		for(int i=0;i<array.length;i++)
		{
			if(min < array[i] && min2 > array[i])
				min2=array[i];
			if(min < array[i] && max2 < array[i] && array[i] < max)
				max2=array[i];

		}
		System.out.println(min2+ "  "+max2);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int array[]=new int[number];
		for(int i=0;i<number;i++)
			array[i]=scan.nextInt();
		scan.close();
		SecMinMax s=new SecMinMax();
		s.minMax(array);
	}
}
