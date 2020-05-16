package Day10;

import java.util.Scanner;

public class Calender {
	public static void calender(int year,int month,int date)
	{	
		int y=year-(14-month)/12;
		int x=y+y/4-y/100+y/400;
		int m=month+12*((14-month)/12)-2;
		int day=(date+x+31*m/12)%7;
	//	System.out.println(day);
		int count=day-1;
		if(day==0)
			day=6;
		for(int i=1;i <= day;i++)
		{
			System.out.print("   ");
		}
		int last=0;
		if(month%2 !=0 ||month %2==0 && month>6)
			last=31;
		else last=30;
		for(int i=1;i <=last;i++)
		{
			++count;
			if(i>9)
			System.out.print(i+" ");
			else System.out.print(i+"  ");
			if(count%7 == 0)
				System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		int month=scan.nextInt();
		int date=1;
		scan.close();
		System.out.print("m  t  w  t  f  s  su\n");
		calender(year, month, date);
	}

}
