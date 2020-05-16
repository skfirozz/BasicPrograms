package Day10;
import java.util.Random;
import java.util.Scanner;
public class TicTacToe {
	static int c=0;
	static Random r=new Random();
	static Scanner scan=new Scanner(System.in);
	static boolean WF=false;
	public static int array[][]=new int[3][3];
	public static void inputss()
	{
		int i=r.nextInt(3);
		int j=r.nextInt(3);
		if(array[i][j]==1||array[i][j]==2)
			inputss();
		else 
		{
			c++;
			array[i][j]=1;
			System.out.println(i+" "+j);
			if(c>=3 && !WF)
				checkingWinOrLose();
			c++;
			if(c!=10 && !WF)
				user();
			if(c>=3 && !WF)
				checkingWinOrLose();
		}
	}
	static void count()
	{
		if(c <=8  && !WF)
		{
			inputss();
			count();
		}
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
	public static void checkingWinOrLose()
	{
		int count=0;
		for(int m=0;m<3;m++)
		{
			count=0;
			int count1=0;
			int count2=0;
			for(int n=0;n<3;n++)
			{
				if(array[m][n]==1)
				{
					count1++;
				}
				if(array[m][n]==2)
					count2++;
			}
			if(count1==3 || count2==3)
			{
				count++;
				if(count1==3)
				System.out.println("win+"+"  system");
				if(count2==3)
					System.out.println("win+"+"  user");
				WF=true;
				break;
			}
		}
		if(array[1][1]!=0)
		 if(array[0][0] == array[1][1] && array[1][1]==array[2][2]||array[0][2] == array[1][1] && array[1][1]==array[2][0])
			{
				count++;
				if(array[1][1]==1)
				 System.out.println("winner System");
				if(array[1][1]==2)
					 System.out.println("winner User");
				 WF=true;
			}
		if(count==0)
			for(int n=0;n<3;n++)
			{
				int count1=0;
				int count2=0;
				for(int m=0;m<3;m++)
				{
					if(array[m][n]==1 )
						count1++;
					if(array[m][n]==2)
						count2++;
				}
				if(count1==3||count2==3)
				{
					if(count1==3)
						System.out.println("win+"+"  system");
						if(count2==3)
							System.out.println("win+"+"  user");
					WF=true;
					break;
				}
			}
	}
	public static void main(String[] args) {
		count();
		for(int k=0;k<3;k++)
		{
			for(int m=0;m<3;m++)
			{
				System.out.print(array[k][m]+" ");
			}
			System.out.println();
		}
}
}