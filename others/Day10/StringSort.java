package Day10;
import java.util.Scanner;
public class StringSort {
	 void sort(String array[])
	{
		StringSort s=new StringSort();
		for(int  j=0;j < array.length ;j++)
		for( int i=j;i<array.length;i++)
		{
		 if(array[j].charAt(0) > array[i].charAt(0) && i != j)
			 {
				s.swap(i,j,array);
			 }
		}
	}
	static void sameSwap(String array[])
	{	
		StringSort s=new StringSort();
		s.sort(array);
			for( int a=0; a < array.length ;a++)
			{
				for( int b=a+1; b < array.length ;b++) 
				{
				if(array[a].charAt(0) == array[b].charAt(0) && a != b)
				{
					for(int m=1;m < array[a].length();m++)
					{
						if(array[a].charAt(m) > array[b].charAt(m))
						{
							s.swap(a,b,array);
							break;
						}
						else if(array[a].charAt(m) < array[b].charAt(m))
							break;
					}
				}
			}
			}
	}
	 void swap(int i,int j,String array[])
	{
		String temp=array[j];
		array[j]=array[i];
		array[i]=temp;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String array[]=new String[10];
		for(int i=0;i<10;i++)
			array[i]=scan.next();
		scan.close();
		sameSwap(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]+" ");
	}
}
