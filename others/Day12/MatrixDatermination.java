package Day12;
import java.util.Scanner;
public class MatrixDatermination {
	static int count=0,value=0, iC=0;
	static void determination(int array[][],int count)
	{	
		int c=0;
		int n1=1,n2=1,n3=1,n4=2,val=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i !=iC && j!=count)
				{
					c++;
					if(c==1)
						 n1=array[i][j];
					else if(c==2) 
						 n2=array[i][j];
					else if(c==3)
						n3=array[i][j];
					else if(c==4)
					{
						n4=array[i][j];
//					System.out.println(n1+" "+n2+" "+n3+" "+n4);
						val=n1*n4-n3*n2;
//						System.out.println(val);
						val=val*array[0][count];
//						System.out.println(val);
					}	
				}
			}
		}
		if(count%2==0)
			value=value+val;
		else value=value-val;
		count++;
		if(iC < 3)
		det(count, array);
	}
	static void det(int count,int array[][])
	{
		if(count < 3)
		{	
			determination(array, count);
			System.out.println(value);
		}
		
		iC++;
		value=1;count=0;
		if(iC < 3)
			det(count, array);
	}
	public static void main(String[] args) {
		int array[][]= new int[3][3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				array[i][j]=scan.nextInt();
		scan.close();
		determination(array,count);
		System.out.println(value);
	}
}
