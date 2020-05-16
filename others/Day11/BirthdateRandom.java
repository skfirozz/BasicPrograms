package Day11;

import java.util.Random;

public class BirthdateRandom {
	static void birthDate(String array[])
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
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i].equals(array[j]) && i !=j )
				{
					System.out.println(array[j]+"  ");
				}
			}
		}
	}
	public static void main(String[] args) {
		String array[]=new String[50];
		birthDate(array);
	}
	

}
