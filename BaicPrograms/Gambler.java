import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out.println("enter number of trails: ");
		double trails=scan.nextInt();
		System.out.println("enter stake: ");
		int stake=scan.nextInt();
		System.out.println("enter goals: ");
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
