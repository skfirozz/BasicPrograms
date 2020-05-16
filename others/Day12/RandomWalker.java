package Day12;
import java.util.Random;
public class RandomWalker {
	static int count=0,c=5/2,r=5/2;static boolean boo=false;
	static Random ran=new Random();
	static void selectGrid(int row,int col)
	{
		int ro=r,co=c;
		int n=ran.nextInt(4)+1;
		
		if(n==1)
			r--;
		else if(n==2)
			c++;
		else if(n==3)
			r++;
		else if(n==4)
			c--;
		check(r, c);
		if(ro==r && co==c)
		{
			 selectGrid(r,c);
		}
//		System.out.println(n);
		
			
	}
	static void random(int array[][])
	{
		if(count==0)
			array[r][c]=1;
			selectGrid(r,c);
			check(r,c);
			array[r][c]=1;
			count++;
			System.out.println(r+" "+c+"  "+count);
			ch(array);
			if(boo==true && count <4000)
			{
				random(array);
			}
			else
				System.out.println(".....................................");
	}
	static void check(int iD1,int iD2)
	{
		if(r > 4)
			r=4;
		if(c > 4)
			c=4;
		if(r < 0)
			r=0;
		if(c <  0)
			c=0;
	}
	static void ch(int array[][])
	{
		int count=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(array[r][c]==0)
				{
					boo=true;
					
					count++;
				}
				if(count!=0)
					break;
			}
			if(count!=0)
				break;
		}
		if(boo=true)
		{
			System.out.println("++++++++");
			boo=true;
		}else {
			boo=false;
			System.out.println("----------");
		}
	}
	public static void main(String[] args) {
		int array[][]=new int[5][5];
		random(array);
	}
}
