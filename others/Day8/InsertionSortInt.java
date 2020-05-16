package Day8;
import java.util.Scanner;
public class InsertionSortInt {
	static void InSort(int array[])
	{
		for(int i=1;i<array.length;i++)
		{
			int temp=array[i];
			int j=i-1;
			while(j>=0 && array[j] > temp)
			{
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int length=scan.nextInt();
		int array[]=new int[length];
		for(int i=0;i<length;i++)
			array[i]=scan.nextInt();
		scan.close();
		InSort(array);
				for(int i=0;i<length;i++)
			System.out.print(array[i]+" ");
	}
}
