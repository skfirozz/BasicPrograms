import java.util.Scanner;

public class HarmonicNumber {
	static void harmonic(int number,double array[])
	{
		double n=0;
		for(int i=1;i<number;i++)
		{
			n=n+1.0/i;
			array[i]=n;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number for harmonic number: ");
		int number=scan.nextInt();
		scan.close();
		double array[]=new double[number];
		harmonic(number, array);
		for(int i=0;i<number;i++)
			System.out.println(array[i]);
	}
}
