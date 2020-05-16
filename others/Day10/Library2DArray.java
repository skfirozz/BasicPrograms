package Day10;

import java.util.Scanner;

public class Library2DArray {
	static void  output(int array[][],int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int array[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				array[i][j]=scan.nextInt();
		scan.close();
	}

}
