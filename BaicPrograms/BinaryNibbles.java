import java.util.Scanner;

public class BinaryNibbles {

	void numberToBinary(int number)
	{
		int count=0;
		int temp=number;
		while(temp != 0)
		{
			temp=temp/2;
			count++;
		}
		if(count < 8)
			count=8;
		int array[]=new int[count];
		int c=count-1;
		while(number != 0)
		{
			array[c]=number%2;//inserting values from last position of array
			number=number/2;
			c--;
		}
		System.out.println();
		for(int i=0 ;i< array.length;i++)
			System.out.print(array[i]+" ");
		swap(array);
		binaryToNumber(array);
	}
	
	
	void swap(int array[])
	{
		int j=array.length/2;
		for(int i=0;i<array.length/2;i++)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			j++;
		}
		System.out.println();
		for(int i=0 ;i< array.length;i++)
			System.out.print(array[i]+" ");
	System.out.println();
	}
	
	void binaryToNumber(int array[])
	{
		int value=1;
		for(int i=1;i<array.length;i++)
		{
			value=value*2+array[i];
		}
		System.out.println(value);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number =scan.nextInt();
		scan.close();
		BinaryNibbles b=new BinaryNibbles();
		b.numberToBinary(number);
	}
}
