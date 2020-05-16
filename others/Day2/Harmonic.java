package Day2;
import java.util.Scanner;
public class Harmonic {
	void value(int number)
	{
		double value=0;
		if(number>0)
		{
			for(int i=1;i<=number;i++)
				value=(value)+1.0/i;
			System.out.println(value);
		}
		else
			System.out.println("number must be greaterthen zero");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		scan.close();
		Harmonic h=new Harmonic();
		h.value(number);
		
	}

}
