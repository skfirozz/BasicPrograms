import java.util.Scanner;

public class ToBinary {

	void BinaryNumber(int number)
	{
		int count=0;
		int temp=number;
		while(temp != 0)
		{
			temp=temp/2;
			count++;
		}
		int array[]=new int[count];
		int c=0;
		while(number != 0)
		{
			array[c]=number%2;
			number=number/2;
			c++;
		}
		for(int i=array.length-1; i>=0 ;i--)
			System.out.print(array[i]+" ");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		scan.close();
		ToBinary b=new ToBinary();
		b.BinaryNumber(number);
	}
}
