package Day4;
import java.util.Scanner;
public class Permutations {
	public static void method(String str1,String str2 )
	{
		 if (str1.length() == 0) 
		 	{ 
	            System.out.println(str2 + " "); 
	            return; 
	        } 
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			 String ros = str1.substring(0, i) +  str1.substring(i + 1); 
			 method(ros, str2 + ch);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		method(str, " ");
				}
	}
