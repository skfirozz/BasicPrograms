package Day3H;
import java.util.Scanner;
public class PrimeFactors {
	void factors(int number)
	{
		for(int i=2;i<=number;i++)
		{
			int count=0;
			if(number%i==0)
			for(int j=2;j<=i;j++)
				{
					if(i%j==0)
						count++;
				}
			if(count==1)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		scan.close();
		PrimeFactors p=new PrimeFactors();
		p.factors(number);
	}
}
