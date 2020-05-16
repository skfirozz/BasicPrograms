package Day4;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		scan.close();
		int array1[]=new int[str1.length()];
		int array2[]=new int[str2.length()];
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				int number=0;
				number=str1.charAt(i);
				array1[i]=number;
			}
			for(int i=0;i<str2.length();i++)
			{
				int number=0;
				number=str2.charAt(i);
				array2[i]=number;
			}
			for(int i=0;i<array1.length;i++)
			{
				for(int j=0;j<array1.length-i;j++)
				{
					if(array1[i]>array1[j])
					{
						int temp=array1[i];
						array1[i]=array1[j];
						array1[j]=temp;
					}
				}
			}
			for(int i=0;i<array2.length;i++)
			{
				for(int j=0;j<array2.length-i;j++)
				{
					if(array2[i]>array2[j])
					{
						int temp=array2[i];
						array2[i]=array2[j];
						array2[j]=temp;
					}
				}
			}
			int count=0;
			for(int i=0;i<array1.length;i++)
			{
				if(array1[i]==array2[i])
				{
					count++;
				}
			}
			if(count==array1.length)
				System.out.println("anagram");
			else System.out.println("not anagram");
		
		}
	}

}
