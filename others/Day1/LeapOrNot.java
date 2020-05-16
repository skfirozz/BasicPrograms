package Day1;

import java.util.Scanner;

public class LeapOrNot {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		scan.close();
		if(year>=1582)
		{
			if(year%400==0 || year%4 == 0 && year%100 != 0)
				System.out.println("leap");
			else 
				System.out.println("not leap");
		}
	}

}
