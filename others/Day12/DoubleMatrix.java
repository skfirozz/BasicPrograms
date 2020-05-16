package Day12;
public class DoubleMatrix {
	static void dotProduct(double array1[],double array2[])
	{
		double value=0;
		for(int i=0;i<array1.length;i++)
		{
			value=value+array1[i]*array2[i];
		}
		System.out.println("array1.array2  "+value);
	}
	static void transpose(double array[][])
	{
		double transpose[][]=new double[3][3]; 
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			transpose[j][i]=array[i][j];
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}
	static void mMatrixMul(double array1[][],double array2[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int k=0;k<3;k++)
			{
				double t=0;
				for(int j=0;j<3;j++)
				{
					t=t+array1[i][j]*array2[j][k];
				}
				System.out.print(t+"  ");
			}
			System.out.println();
		}
	}
	static void matrixVectorMul(double array1[][],double array2[])
	{
			for(int i=0;i<3;i++)
			{
				double t=0;
				for(int j=0;j<3;j++)
				{
					t=t+array1[i][j]*array2[j];
				}
				System.out.print(t+"  ");
			}
			System.out.println();
	}
	static void vectorMatrixMul(double array1[],double array2[][])
	{
			for(int i=0;i<3;i++)
			{
				double t=0;
				for(int j=0;j<3;j++)
				{
					t=t+array1[j]*array2[i][j];
				}
				System.out.print(t+"  ");
			}
			System.out.println();
	}
}
	


