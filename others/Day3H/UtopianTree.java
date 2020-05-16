package Day3H;

import java.util.Scanner;
public class UtopianTree {
	static int meth(int number) {
		int temp=0,count=0;
		for(int i=0;i<=number;i++)
		{
			if(i==0) {
				temp=1;
				count=1;
			}
			else if (i%2==0) {
				count=count+1;
				
			}
			else {
				count=count*2;
				temp=count;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int array[]=new int[number];
		for(int i=0;i<number;i++)
		{
			array[i]=scan.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			int val=meth(array[i]);
			System.out.println(val);
				
		}
	}

}
