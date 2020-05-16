package Day8;

import java.util.Random;

public class Ran {
	 
	public static void main(String[] args) {
		int array[][]=new int[6][6];
		Random r=new Random();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j]=r.nextInt(6)+1;
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		int value=0;
		for(int m=0;m<6;m++)
		{	value++;
			int count=0;
			for (int i = 0; i < 6; i++) 
			{
				for (int j = 0; j < 6; j++) 
				{
					if(value==array[i][j])
					count++;
				}
			}
			System.out.println(value+"  "+count);
		}
	}
		
		
		
	}

