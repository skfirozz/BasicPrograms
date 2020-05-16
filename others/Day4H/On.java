package Day4H;

public class On {
	static int i=0;
	public static void i()
	{
		i++;
		if(i<=100)
			System.out.println(i);
		
		i();
		
	}
	public static void main(String[] args) {
	i();	
	}

}
