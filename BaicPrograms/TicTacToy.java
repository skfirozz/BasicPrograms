import java.util.Random;
import java.util.Scanner;

public class TicTacToy {

	static int c=0;
	static Random r=new Random();
	static Scanner scan=new Scanner(System.in);
	static boolean WF=false;
	public static int array[][]=new int[3][3];
	public static void inputss()
	{
	}
	static void user()
	{
		System.out.print("-->");
		int row=scan.nextInt();
		int col=scan.nextInt();
		if(array[row][col]==1 || array[row][col]==2)
		{
			System.out.println("position already occupied");
			user();
		}
		else
		{
			array[row][col]=2;
		}
	}
	public static boolean checkingWinOrLose(int array[][])
	{
		if(array[0][0] == array[0][1])
		return true;
		else
		return false;
		
	}
	public static void main(String[] args) {
	
	}
}
