package Day3;
import java.util.Scanner;
public class Sin {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double x=scan.nextDouble();
		scan.close();
		x=x%(2*Math.PI);
		System.out.println(x);
		double sinFinValue=0,cosFinValue=0;
		int count1=0,count2=0;
		for(int i=1;i<=7;i++)
		{
			double sinVal=0;
			double cosVal=0;
			if(i%2 !=0)
			{	
				count1++;
				double pow=Math.pow(x, i);
				int value=1;
				for(int j=1;j<=i;j++)
				{
					value=value*j;
				}
				 sinVal=pow/value;
				if(count1%2 != 0)
					sinFinValue=sinFinValue+sinVal;
				else
					sinFinValue=sinFinValue-sinVal;
			}
			else
			{	
				count2++;
				double pow=Math.pow(x, i);
				int value=1;
				for(int j=1;j<=i;j++)
				{
					value=value*j;
				}
				 cosVal=pow/value;
				if(count2%2 == 0 && count2>1)
					cosFinValue=cosFinValue-cosVal;
				else
					cosFinValue=cosFinValue+cosVal;
			}
		}
		double sin=Math.sin(x);
		double cos=Math.cos(x);
		System.out.println(sin+"   "+sinFinValue);
		System.out.println(cos+"   "+cosFinValue);
	}
}
