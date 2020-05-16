package Day2;

import java.util.Scanner;

public class SqrtEpsilon {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		double c=scan.nextDouble();
		scan.close();
		
		double t=c;
		t=(c/t+t)/2;
		
		
		//System.out.println(t);
		
	}

}
