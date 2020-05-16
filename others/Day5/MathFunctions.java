package Day5;
public class MathFunctions {
	public static double harmonic(int number)
	{
		double value=0.0;
		if(number>0)
		{
			for(int i=1;i<=number;i++)
			{
				value=(value)+1.0/i;
			}
				System.out.println(value);
			return value;
		}
		return value;
	}
	
	public static double sin(double number)
	{
		number=number%(2*Math.PI);
		double sinFinValue=0;
		int count1=0;
		for(int i=1;i<=7;i++)
		{
			double sinVal=0;
			if(i%2 !=0)
			{	
				count1++;
				double pow=Math.pow(number, i);
				int value=1;
				for(int j=1;j<=i;j++)
					value=value*j;

				sinVal=pow/value;
				if(count1%2 != 0)
					sinFinValue=sinFinValue+sinVal;
				else
					sinFinValue=sinFinValue-sinVal;
			}
	}
		return sinFinValue;
	}
	
	public static double cos(double number)
	{
		number=number%(2*Math.PI);
		double cosFinValue=0;
		int count1=0;
		for(int i=1;i<=7;i++)
		{
			double cosVal=0;
			if(i%2 ==0)
			{	
				count1++;
				double pow=Math.pow(number, i);
				int value=1;
				for(int j=1;j<=i;j++)
					value=value*j;

				cosVal=pow/value;
				if(count1%2 != 0)
					cosFinValue=cosFinValue-cosVal;
				else
					cosFinValue=cosFinValue+cosVal;
			}
		}
		return 1-cosFinValue;
	}
	
	public static int[] binary(int number)
	{
		int temp=number;
		int count=0;
		while(temp != 0)
		{
				count++;
				temp=temp/2;
		}
		int array[]=new int[count];
		int count1=-1;

		while(number != 0)
		{
				int binary=number%2;
				count1++;
			number=number/2;
			array[count1]=binary;
		}
		return array;
	}
	
	public static double sqrt(double  c)
	{
		double number=Math.sqrt(c);
		return number;
	}
	
	
	public static double sqrt(int  c,double epsilon)
	{
		double t=c;
		
		double number=0;
		System.out.println(epsilon*t);
		while(epsilon*t > number)
		{
			t=t+ c/t;
			 number=number+Math.abs(t - c/t);
			 System.out.println(number);
		}
		return number;
	}
	
	public static boolean prime(int number)
	{
		if(number>1)
		{
			int count=0;
			for(int i=1;i<=number;i++)
			{
				if(number%i == 0)
					count++;
			}
			if(count==2)
				return true;
		}
		return false;
	}
	
	public static long fact(int number)
	{
		long fact=1;
		for(int i=1;i<=number;i++)
			fact=fact*i;
		return fact;
	}
	
	
	public static double compoundIntrest(int amount,int tPeriod, int rPeriod)
	{
		double value= amount*Math.pow(1+rPeriod, tPeriod);
		return value;
	}
	
	public static double CompoundIntrestPValue(double amount,int tPeriods,int rPeriods)
	{
		double presentValue=amount*Math.pow(1+rPeriods, tPeriods);
		return presentValue;
	}
	
	public static int minMax(int array[])
	{
		int min=array[1],max=0;
		for(int i=0;i<array.length;i++)
		{
			if(min > array[i])
				min=array[i];
			
			if(max < array[i])
				max=array[i];
		}
		System.out.println(min+"  "+max);
		return min;
	}
	
	public static String minMax(String array[],int number)
	{
			int arr[]=new int[number];
			for(int i=0;i<array.length;i++)
			{
				int count=0;
				for(int j=0;j<array[i].length();j++)
				{
					count=count+array[i].charAt(j);
				}
				arr[i]=count;
			}
			int min=arr[1],max=0,minPos=0,maxPos=0;
			for(int i=0;i<array.length;i++)
			{
				if(min > arr[i])
				{
					min=arr[i];
					minPos=i;
				}
				if(max < arr[i])
				{
					max=arr[i];
					maxPos=i;
				}
			}
			return array[minPos]+"  "+array[maxPos];
	}
	
	public static boolean areaOfTriangle(int x1,int x2,int x3,int y1,int y2,int y3)
	{
		double a=x1-x2, b=x2-x3;
		double c=y1-y2, d=y2-y3;
		
		double value=0.5*Math.abs(a*d-b*c);
		if(value==0)
		return true;
		return false;
	}
	
	
	public static boolean slope(int x1,int x2,int x3,int y1,int y2,int y3)
	{
		double AB = (y2-y1)/(x2-x1);
		double BC = (y3-y2)/(x3-x2);
		double AC = (y3-y1)/(x3-x1);
		
		if(AB == AC && BC==AC && AC== AB)
		return true;
		return false;
	}
	
	public static void main(String[] args) {
		double epsilon=8.854 * Math.pow(10,-12);

		int arr[]=binary(40);
		for(int i=arr.length-1;i>=0;i--)
		System.out.print(arr[i]);
	}
}
