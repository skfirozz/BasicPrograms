package Day10;
import java.util.Random;
public class ShuffleCards {
	static int count=0;
	static 	int array[]=new int[9];
	static Random r=new Random();
	static void shuffle()
	{
			int n=r.nextInt(9)+1;
			int c=0;
			for(int i=0;i<=count;i++)
			{
				if(array[i]==n)
					c++;
			}
			if(c==0)
			{
				array[count]=n;
				count++;
				if(count <9 )
					shuffle();
			}
			else if(count < 9)
				shuffle();
	}
	static void times(int number)
	{
		int n=number+4;
		System.out.println(array[number]+" "+array[n]);
		number++;
		if(number < 4)
			times(number);
	}
	public static void main(String[] args) {
		shuffle();
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
//		times(0);
	}
}

