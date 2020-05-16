import java.util.Scanner;

public class MonthyPayment {

	double payment(int years, double percent, int amount)
	{
		double r=percent/(12*100);
		int n=12*years;
		
		double payment=(amount*r)/(1-Math.pow(1+r, -n));
		return payment;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int years=scan.nextInt();
		int amount=scan.nextInt();
		double percent=scan.nextDouble();
		scan.close();
		MonthyPayment m=new MonthyPayment();
		System.out.println(m.payment(years, percent, amount));
	}
}
