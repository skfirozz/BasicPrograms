package Day12;
import java.util.Scanner;
public class TransposeMatrix {
	static void transpose(int array[][],int m)
	{
		int tempArray[][]=new int[m][m]; 
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			tempArray[j][i]=array[i][j];
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int array[][]=new int[m][m];
		for(int i=0;i<m;i++)
			for(int j=0;j<m;j++)
				array[i][j]=scan.nextInt();
		scan.close();
		System.out.println();
		transpose(array, m);
	}
}
