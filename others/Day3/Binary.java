package Day3;
import java.util.Scanner;
public class Binary {
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
	}
}
