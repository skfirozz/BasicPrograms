package Day4;

import java.util.Scanner;

public class PalindromeString {
	public static boolean palindrome(String str)
	{
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2 +=str.charAt(i);
		}
		int count=0;
		for(int i=0;i<str2.length();i++)
		{
			if(str.charAt(i)==str2.charAt(i))
			{
				count++;
			}
		}
		if(str.length()==count)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		System.out.println(palindrome(str));
	}

}
