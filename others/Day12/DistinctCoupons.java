package Day12;
public class DistinctCoupons {
	static int count=0;
	static 	double array[][]=new double[3][3];
	static void shuffle()
	{
			double n=Math.random();
			int c=0;
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
				{
					if(array[i][j]==n)
					c++;
				}
			if(c==0)
			{
				int c1=0;
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						if(array[i][j]==0)
						{
							c1++;
							array[i][j]=n;
							break;
						}
					}
					if(c1!=0)
						break;
				}
			}
			else shuffle();
				count++;
				if(count < 3*3 )
					shuffle();
		}
	public static void main(String[] args) {
		shuffle();
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				System.out.println(array[i][j]);
		System.out.println();
	}
}
