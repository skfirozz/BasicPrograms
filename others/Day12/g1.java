package Day12;
import java.util.Scanner;
public class g1 {
	static void meth(String s)
	{
		String emp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) =='a'||s.charAt(i) =='e'||s.charAt(i) =='i'||s.charAt(i) =='o'||s.charAt(i) =='u')
			{
				emp=emp;
			}
			else emp=emp+s.charAt(i);
		}
		System.out.println(emp);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		meth(str);
	}
}
