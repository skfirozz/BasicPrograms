package Day1;
import java.util.Scanner;
public class DoubleOpt {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		scan.close();
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println(a%b+c);
	}
}
