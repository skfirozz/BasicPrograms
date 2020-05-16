package Day3;
import java.util.Scanner;
public class BinarySwap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		scan.close();
		int temp=number;
		String str="";
		while(temp != 0)
		{
			int binary=temp%2;
			str=binary+str;
			temp=temp/2;
		}
		System.out.println(str);
		if(str.length()>=8)
		{
			System.out.println("OverFlow");
		}
		else
		{
			for(int i=str.length();i<8;i++)
			{
				str="0"+str;
			}
		}
		System.out.println(str);
		String temp1="",temp2="";
		for(int i=0;i<str.length()/2;i++)
		{
			temp1=temp1+str.charAt(i);
		}
		for(int i=str.length()/2;i<str.length();i++)
		{
			temp2=temp2+str.charAt(i);
		}
		str=temp2+temp1;
		System.out.println(str);
	int dec=Integer.parseInt(str,2)	;
	System.out.println(dec);
	}
}
