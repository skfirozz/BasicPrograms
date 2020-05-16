package Day2;

import java.util.Scanner;

public class Trig {
	void angle(double radians)
	{
		radians=Math.toRadians(radians);
		System.out.println("sin "+Math.sin(radians));
		System.out.println("cos "+Math.cos(radians));
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double angle=scan.nextInt();
		scan.close();
		Trig t=new Trig();
		t.angle(angle);
		 
	}
}
