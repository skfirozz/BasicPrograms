package Day2H;
import java.util.Scanner;
public class CarLoan {
	void monthlyPayment(int  years,double intrest,int  amount)
	{
		int n=12*years;
		double r=intrest/(12*100);
		double div=Math.pow(1+r, -n);
		double payment=(amount*r)/(1-div);
		System.out.println(payment);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int years=scan.nextInt();
		double intrest=scan.nextDouble();
		int amount=scan.nextInt();
		scan.close();
		CarLoan c=new CarLoan();
		c.monthlyPayment(years, intrest, amount);
		
		
	}
}
