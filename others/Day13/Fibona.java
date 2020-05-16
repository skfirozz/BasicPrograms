package Day13;
import java.util.Scanner;
public class Fibona {
	static void fibonacci(int n,int array[])
	{
		int array1[]=new int [n];
		int a=0,b=0,c=1;
		for(int i=0;i<n;i++)
		{
			if(i==0 || i==1)
				array1[i]=i;
			else
			{
				a=b;
				b=c;
				c=a+b;
				array1[i]=c;
			}
			//System.out.println(array1[i]+" ");
		}
		for(int i=0;i<array.length;i++)
		{
			if(array1[i]!=array[i])
				System.out.println(array1[i]);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		scan.close();
		fibonacci(n,array);
	}
}
