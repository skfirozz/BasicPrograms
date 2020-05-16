import java.util.Random;
import java.util.Scanner;

public class CoupounNumbers {

	static Random ran=new Random();
	static double[] coupoun(double array[],int number)
	{
		int count=0;
		double randomValue=ran.nextDouble();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==randomValue)
				count++;
		}
		if(count>0)
			coupoun(array,number);
		else
			array[number]=randomValue;
		return array;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number of coupoun numbers you want:  ");
		int number=scan.nextInt();
		double array[]=new double[number];
		for(int i=0;i<number;i++)
		{
			array=coupoun(array, i);
			System.out.println(array[i]);
		}
	}
}
