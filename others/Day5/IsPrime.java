package Day5;
import java.util.Scanner;
public class IsPrime {
	public static boolean prime(int number)
	{
		if(number>1)
		{
			int count=0;
			for(int i=1;i<=number;i++)
			{
				if(number%i == 0)
					count++;
			}
			if(count==2)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		System.out.println(prime(n));
		
	}

}
