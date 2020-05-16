package Day13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class MaxMinFile {
	static void minMaxFile() throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Ershad\\Desktop\\writing.txt"));
		String array[]=new String [13];
		String str="";
		while((str=br.readLine()) != null)
				{
					array=str.split(" ");
				}
		int array1[]=new int[13];
		int min=array1[0],max=0;
		for(int i=0;i<array.length;i++)
		{
			array1[i]=Integer.parseInt(array[i]);
			if(min > array1[i])
				min=array1[i];
			if(max < array1[i])
				max=array1[i];
		}
		
		System.out.println(min+" "+max);
	}
	public static void main(String[] args) throws IOException {
		minMaxFile();
	}

}
