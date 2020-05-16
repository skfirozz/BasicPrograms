package Day5H;
import java.util.Scanner;
public class CheckCollinearSlope {
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
		Scanner scan=new Scanner(System.in);
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		int x3=scan.nextInt();
		int y3=scan.nextInt();
		scan.close();
		System.out.println(areaOfTriangle(x1, x2, x3, y1, y2, y3));
		System.out.println(slope(x1, x2, x3, y1, y2, y3));
		
	}

}
