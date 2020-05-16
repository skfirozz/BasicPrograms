package Day2;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number: ");
		int number=scan.nextInt();
		int value=1;
		for(int i=1;i<=number;i++)
		{
			value=value*2;
			System.out.println(value);
		}
		
	}

}
