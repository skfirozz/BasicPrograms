import java.util.Scanner;


public class PowerOfTwo {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int value=1;
		for(int i=1;i<=10;i++)
		{
			value=value*2;
			if(number==value)
			{
				System.out.println("yes");
			}
			System.out.println(value);
		}
		
	}

}
