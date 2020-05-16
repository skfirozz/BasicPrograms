import java.util.Scanner;

public class TwoDArray {

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
		System.out.println("enter number of rows:  ");
		int m=scan.nextInt();
		System.out.println("enter number of columns:  ");
		int n=scan.nextInt();
		int array[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				array[i][j]=scan.nextInt();
		scan.close();
		output(array, m, n);
	}
}
