package Day10;
import java.util.Scanner;
public class stringWordRev {
	static void rev(String str)
	{
		for(int i=0;i<str.length();i++ )
		{
			String s="";
			while(str.charAt(i) !=' '&& i < str.length()-1)
			{
				s=str.charAt(i)+s;
				i++;
			}
			System.out.print(s+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		rev(str);
	}
}
