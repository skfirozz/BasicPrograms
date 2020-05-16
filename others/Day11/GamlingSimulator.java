package Day11;
import java.util.Scanner;
public class GamlingSimulator {
	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		double trails=scan.nextInt();
		int stake=scan.nextInt();
		int goals=scan.nextInt();
		scan.close();
		double wins=0;		
		for(int i=1;i<=trails;i++)
		{
			double value=Math.random();
			if(value>0.5)
				wins++;
		}
		System.out.println("no of times own   "+wins);
		System.out.println("percent  "+wins/trails*100);
		System.out.println("bets   "+trails);
	}
}
