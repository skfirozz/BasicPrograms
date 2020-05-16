package Day8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileWordSearching {
	public static void wordSearching() throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\Ershad\\Desktop\\file2.txt");
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		String array[]=new String[10];
		String str;
		String input="hi";
		int count=0;
		while((str=br.readLine()) !=null)
		{
			array=str.split(" ");
			for(String word:array)
			{
				System.out.print(word+" ");
				if(word.equalsIgnoreCase(input))
					count++;
			}
		}
		if(count!=0)
		{
			System.out.println("\n"+input+"  "+count);
		}
	}
	public static void main(String[] args) throws IOException {
		wordSearching();
	}
}
