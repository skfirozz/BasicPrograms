package Day4H;
import java.util.Scanner;
public class CalenderExtend {
	public static void day(int year,int month,int date)
	{
		int y=year-(14-month)/12;
		int x=y+y/4-y/100+y/400;
		int m=month+12*((14-month)/12)-2;
		int day=(date+x+31*m/12)%7;
		System.out.println(day);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		int month=scan.nextInt();
		int date=scan.nextInt();
		scan.close();
		day(year, month, date);
	}
}
