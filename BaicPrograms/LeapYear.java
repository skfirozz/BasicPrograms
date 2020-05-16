import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a year:  ");
		int year=scan.nextInt();
		scan.close();
		if(year>=1582)
		{
			if(year%400==0 || year%4 == 0 && year%100 != 0)
				System.out.println("leap year");
			else 
				System.out.println("not leap year");
		}
	}
}
