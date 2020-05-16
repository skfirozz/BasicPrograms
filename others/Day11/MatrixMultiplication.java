package Day11;
import java.util.Scanner;
public class MatrixMultiplication {
	static void multiplication(int array1[][],int array2[][])
	{
		for(int i=0;i<2;i++)
		{
			for(int k=0;k<2;k++)
			{
				int t=0;
				for(int j=0;j<3;j++)
				{
					t=t+array1[i][j]*array2[j][k];
				}
				System.out.print(t+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int array1[][]= new int[2][3];
		int array2[][]= new int[3][2];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++)
				array1[i][j]=scan.nextInt();
		for(int i=0;i<3;i++)
			for(int j=0;j<2;j++)
				array2[i][j]=scan.nextInt();
		scan.close();
		multiplication(array1, array2);
	}
}
/*
1 2 3
4 5 6
1 2
3 4
5 6*/