package Day2;

import java.util.Scanner;

public class Temperature {
	void conversion(double celsius,double faranheet)
	{
		celsius= (celsius*9/5)+32;
		faranheet= (faranheet-32)*5/9;
		System.out.println("faranheet  "+celsius);
		System.out.println("celsius  "+faranheet);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double celsius=scan.nextDouble();
		double faranheet=scan.nextDouble();
		scan.close();
		Temperature t=new Temperature();
		t.conversion(celsius, faranheet);
	}

}
