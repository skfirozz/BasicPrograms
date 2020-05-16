package Day11;
import java.util.Random;
import java.util.Scanner;
public class RollDie {
	static void roll(int array[],int find)
	{
		Random r=new Random();
		for(int i=0;i<array.length;i++)
			array[i]=r.nextInt(6)+1;
		int count=0;
		for(int i=0;i<array.length;i++)
			if(array[i]==find)
				count++;
		System.out.println(find +"  number is repeated  "+count+" times");
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int find=scan.nextInt();
		scan.close();
		int array[]=new int[number];
		roll(array, find);
		
	}
}
