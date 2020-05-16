import java.util.Scanner;

public class FlipCoins {
	static double tails=0,heads=0;
	void value(double value)
	{
		if(value>0.5)
		heads++;
		else tails++;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of flips you want:  ");
		int number=scan.nextInt();
		
		FlipCoins f=new FlipCoins();
		for(int i=1;i<=number;i++)
		{
			double value1=Math.random();
			f.value(value1);
		}
		System.out.println("heads  "+heads/number*100);
		System.out.println("tails  "+tails/number*100);
	}

}
