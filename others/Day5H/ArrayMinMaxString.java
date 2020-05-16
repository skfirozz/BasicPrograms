package Day5H;
import java.util.Scanner;
public class ArrayMinMaxString {
	public static String minMax(String array[],int number)
	{
			int arr[]=new int[number];
			for(int i=0;i<array.length;i++)
			{
				int count=0;
				for(int j=0;j<array[i].length();j++)
				{
					count=count+array[i].charAt(j);
				}
				arr[i]=count;
			}
			int min=arr[1],max=0,minPos=0,maxPos=0;
			for(int i=0;i<array.length;i++)
			{
				if(min > arr[i])
				{
					min=arr[i];
					minPos=i;
				}
				if(max < arr[i])
				{
					max=arr[i];
					maxPos=i;
				}
			}
			return array[minPos]+"  "+array[maxPos];
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		String array[]=new String[number];
		for(int i=0;i<number;i++)
		{
			array[i]=scan.next();
		}
		scan.close();
		System.out.println(minMax(array, number));
	}
}
		