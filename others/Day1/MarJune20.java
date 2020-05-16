package Day1;
import java.util.Scanner;
public class MarJune20 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int d=scan.nextInt();
		scan.close();
		if(m > 2 && m < 7)
		{
			if(m==3 && d >= 20 && d <= 31  || m==6 && d <=20 && d !=0|| d !=0 && d<=31 && m !=3 && m!=6 )
			{
				System.out.println("true");
			}
			else System.out.println("false");
		}
		else System.out.println("false");
	}
}
