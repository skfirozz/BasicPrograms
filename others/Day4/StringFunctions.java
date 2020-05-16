package Day4;
import java.util.Arrays;
import java.util.Scanner;
public class StringFunctions {
	public static void permutation(String str1,String str2 )//permutation
	{
		 if (str1.length() == 0) 
		 	{ 
	            System.out.println(str2 + ""); 
	            return; 
	        } 
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			 String ros = str1.substring(0, i) +  str1.substring(i + 1); 
			 permutation(ros, str2 + ch);
		}
	}
	
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
	
	public static boolean anagram(String str1,String str2)//Anagram
	{
		char arr1[]=str1.toCharArray();
		Arrays.parallelSort(arr1);
		char arr2[]=str2.toCharArray();
		Arrays.parallelSort(arr2);
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(arr1[i]==arr2[i])
				count++;
		}
		if(count==arr1.length)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String permutation=scan.nextLine();
		String palindrome=scan.nextLine();
		String ana1=scan.nextLine();
		String ana2=scan.nextLine();
		scan.close();
		permutation(permutation, "");
		palindrome(palindrome);
		anagram(ana1, ana2);
	}

}
