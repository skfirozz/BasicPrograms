package Day9;
import java.util.Scanner;
public class PoemFarm {
	static void poem(String sound,String animal)
	{
		String str="Old MacDonald had a farm,\r\n" + 
				"E-I-E-I-O.\r\n" + 
				"And on his farm he had some %ANIMAL%,\r\n" + 
				"E-I-E-I-O.\r\n" + 
				"With a %SOUND%, %SOUND% here,\r\n" + 
				"And a %SOUND%, %SOUND% there,\r\n" + 
				"Here a %SOUND%, there a %SOUND%,\r\n" + 
				"Everywhere a %SOUND%, %SOUND%,";
		str=str.replace("%ANIMAL%", animal);
		str=str.replace("%SOUND%", sound);
		System.out.println(str);
	}
	 void sound(String animal)
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
		String animal=scan.next();
		scan.close();
		PoemFarm p=new PoemFarm();
		p.sound(animal);
	}
}
