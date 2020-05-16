package Day5H;

import java.util.Scanner;

public class CompundIntrestPresent {
	public static double presentValue(double amount,int tPeriods,int rPeriods)
	{
		double presentValue=amount*Math.pow(1+rPeriods, tPeriods);
		return presentValue;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double amount=scan.nextDouble();
		int tPeriods=scan.nextInt();
		int rPeriods=scan.nextInt();
		scan.close();
		System.out.println(presentValue(amount, tPeriods, rPeriods));
	}

}
