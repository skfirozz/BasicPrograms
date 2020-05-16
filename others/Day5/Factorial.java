package Day5;

public class Factorial {
	public static long fact(int number)
	{
		long fact=1;
		for(int i=1;i<=number;i++)
			fact=fact*i;
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
