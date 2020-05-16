package Day2;

public class MinMaxRandom {
	 void method(double array[])
	{
	double	min =1,max=0;;
		for(int i=0;i<5;i++)
		{
			min=Math.min(min, array[i]);
			max=Math.max(max, array[i]);
		}
		System.out.println("min  "+min);
		System.out.println("max  "+max);
				
	}
	public static void main(String[] args) {
		double array[]=new double[5];
		for(int i=0;i<5;i++)
		{
			array[i]=Math.random();
			System.out.println(array[i]);
		}
		MinMaxRandom s=new MinMaxRandom();
		s.method(array);
		
	}
		

}
