package Day7;

import java.util.Scanner;

public class SecHighest {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int number=scan.nextInt();
	int array[]=new int[number];
	for(int i=0;i<number;i++)
		array[i]=scan.nextInt();
	scan.close();
	int min=array[0];
	int max=0;
}
}
