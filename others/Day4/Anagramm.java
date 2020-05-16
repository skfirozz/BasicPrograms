package Day4;
import java.util.Arrays;
import java.util.Scanner;
public class Anagramm {
	public static boolean sort(String str1,String str2)
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
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		scan.close();
		System.out.println(sort(str1, str2));
	}

}
