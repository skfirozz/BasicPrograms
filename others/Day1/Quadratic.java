package Day1;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		scan.close();
		double delta=b*b-4.0*a*c;
		double root1,root2;
		delta=Math.sqrt(delta);
		root1=(-b+delta)/(2.0*a);
		root2=(-b-delta)/(2.0*a);
		System.out.println(root1+"  "+root2);
	}

}
