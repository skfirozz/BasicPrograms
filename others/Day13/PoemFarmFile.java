package Day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PoemFarmFile {
	static void poem(String animal,String sound) throws FileNotFoundException
	{
		FileReader fr=new FileReader("C:\\Users\\Ershad\\Desktop\\file2.txt");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		
	}
	static void switchCase(String animal) throws FileNotFoundException
	{
		String s="";
		if(animal.equals("chicks"))
			 s="chick";
		else if(animal.equals("duck"))
			 s="quack";
		else if(animal.equals("turkey"))
			 s="gobble";
		else if(animal.equals("cat"))
			 s="meow, meow";
		else if(animal.equals("mule"))
			 s="heehaw";
		else if(animal.equals("dog"))
			 s="bow, wow";
		else if(animal.equals("turtle"))
			 s="nerp, nerp";
		else if(animal.equals("cow"))
			 s="moo, moo";
		else 
		{
			System.out.println("this is not in farm");
		}
		poem(s,animal);
	 }
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String animal=scan.nextLine();
		scan.close();
//		switchCase(animal);
	}
}
