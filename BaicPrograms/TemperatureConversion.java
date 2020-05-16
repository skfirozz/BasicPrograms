import java.util.Scanner;

public class TemperatureConversion {

	public static void conversion(double celsius,double faranheet)
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
		conversion(celsius, faranheet);
	}
}
