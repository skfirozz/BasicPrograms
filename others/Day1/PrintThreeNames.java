package Day1;

import java.util.Scanner;

public class PrintThreeNames {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String names[]=new String[3];
		for(int i=0;i<names.length;i++)
			names[i]=scan.nextLine();
		scan.close();
		System.out.print("Hi");
		for(int i=names.length-1;i>=0;i--)
			System.out.print(", "+names[i]);
	}

}
