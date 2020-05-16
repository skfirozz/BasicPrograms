import java.util.Random;
import java.util.Scanner;

public class TicTacToy {

	static Random r=new Random();
	static Scanner scan=new Scanner(System.in);
	static boolean WF=false;
	public static int array[][]=new int[3][3];
	public static void systemInputs()
	{
		int i=r.nextInt(3);
		int j=r.nextInt(3);
		if(array[i][j]==1||array[i][j]==2)
			systemInputs();
		else 
			array[i][j]=1;
	}
	static void userInputs()
	{
		System.out.println("enter a row:  ");
		int row=scan.nextInt();
		System.out.println("enter a column: ");
		int col=scan.nextInt();
		if(array[row][col]==1 || array[row][col]==2)
		{
			System.out.println("position already occupied");
			userInputs();
		}
		else
		{
			array[row][col]=2;
		}
	}
	public static void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
	public static boolean checkingWinOrLose(int arr[][],int n)
	{
		   if (
		            arr[0][0] == n && arr[0][1] == n && arr[0][2] == n || arr[1][0] == n && arr[1][1] == n && arr[1][2] == n
		         || arr[2][0] == n && arr[2][1] == n && arr[2][2] == n || arr[0][0] == n && arr[1][0] == n && arr[2][0] == n
		         || arr[0][1] == n && arr[1][1] == n && arr[2][1] == n || arr[0][2] == n && arr[1][2] == n && arr[2][2] == n
		         || arr[0][0] == n && arr[1][1] == n && arr[2][2] == n || arr[0][2] == n && arr[1][1] == n && arr[2][0] == n
		        )
		            return true;
		   else
			   return false;
	}
	public static void main(String[] args) {
	
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				array[i][j]=0;
		
		for(int i=1;i<5;i++)
		{
			if(i==9)
				break;
			userInputs();
			display();
			if(checkingWinOrLose(array, 2))
			{
				System.out.println("you won");
				break;
			}
			systemInputs();
			display();
			if(checkingWinOrLose(array, 1))
				{
				System.out.println("System won");
				break;
				}
		}
	}
}
