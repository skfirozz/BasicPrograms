package Day10;
import java.util.Scanner;
public class Whil {
	static void find(String str)
	{
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			String s2="";
			while(str.charAt(i)!=' ' && i <str.length()-1)
			{
				s2=s2+str.charAt(i);
				i++;
			}
			
			if(s1.length()<s2.length())
				s1=s2;
		}
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				count++;
		}
		System.out.println(s1+" "+count);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		find(str);
	}

}
