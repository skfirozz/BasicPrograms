import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
			array[i]=scan.nextInt();
		scan.close();
		
		for (int i = 1; i < size; i++)
		{
		      int key = array[i];
		      int j = i - 1;
		      while (j >= 0 && key < array[j]) 
		      {
		        // For descending order, change key<array[j] to key>array[j].
		        array[j + 1] = array[j];
		        --j;
		      }
		      array[j + 1] = key;
		    }
		  
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
}
