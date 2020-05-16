import AlgorithmPrograms.WordSearchBinarySeach;

public class BinarySearchWordFromList {

	void wordArrange(String array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i].charAt(0) > array[j].charAt(0) )
				{
					swap(i, j, array);
				}
			}
		}
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
		arrange(array);
		
	}
	void swap(int i,int j,String array[])
	{
		String temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	void arrange(String array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i].charAt(0) == array[j].charAt(0) && i!=j)
				{
					if(array[i].length() > array[j].length())
						swapWhenSame(array, i, j, array[j].length());
					else 
						swapWhenSame(array, i, j, array[i].length());
				}
			}
		}
	}
	void swapWhenSame(String array[],int i,int j,int length)
	{
		for(int m=1;m<length;m++)
		{
			if(array[i].charAt(m) > array[j].charAt(m))
				{
					swap(i, j, array);
					break;
				}
			else if(array[i].charAt(m) < array[j].charAt(m))
				break;
		}
	}
	
	public static void main(String[] args) {
		String array[]= {"thi","is","firos","hi","js","jsa","mad","mab","nbm","bri","ka"};
		BinarySearchWordFromList w=new BinarySearchWordFromList();
		w.wordArrange(array);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
	}
}
