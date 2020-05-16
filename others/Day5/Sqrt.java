package Day5;

import java.util.Scanner;

public class Sqrt {
	public static double sqrt(int  c,double epsilon)
	{
		double t=c;
		
		double number=0;
		System.out.println(epsilon*t);
		while(epsilon*t > number)
		{
			t=t+ c/t;
			 number=number+Math.abs(t - c/t);
			 System.out.println(number);
		}
		return number;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int c=scan.nextInt();
		scan.close();
		double epsilon=8.854 * Math.pow(10,-12);
		System.out.println(epsilon);
		System.out.println(sqrt(c, epsilon));
	}

}
