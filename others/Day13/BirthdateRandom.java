package Day13;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class BirthdateRandom {
	static void birthDate(String array[]) throws IOException
	{
		Random r=new Random();
		for(int i=0;i<50;i++)
		{
			int year=r.nextInt(2)+92;
			int month=r.nextInt(12)+1;
			int date=r.nextInt(30)+1;
			array[i]=date+"/"+month+"/"+year;
//			System.out.println(array[i]);
		}
		BufferedWriter fw=new BufferedWriter(new FileWriter("C:\\Users\\Ershad\\Desktop\\writing.txt"));
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i].equals(array[j]) && i !=j )
				{
					String s=array[i];
					System.out.println(array[j]+"  ");
					fw.write(s+"\n");
				}
			}
		}
		fw.close();
	}
	public static void main(String[] args) throws IOException {
		String array[]=new String[50];
		birthDate(array);
	}
	

}
