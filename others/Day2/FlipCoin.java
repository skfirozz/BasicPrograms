package Day2;
import java.util.Scanner;
public class FlipCoin {
	static double tails=0,heads=0;
	void value(double value)
	{
		if(value>0.5)
		heads++;
		else tails++;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		scan.close();
		FlipCoin f=new FlipCoin();
		for(int i=1;i<=number;i++)
		{
			double value1=Math.random();
			f.value(value1);
		}
		System.out.println("heads  "+heads/number*100);
		System.out.println("tails  "+tails/number*100);
	}

}
