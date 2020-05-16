package Day5;

public class CompoundIntrest {
	public static double intrest(int amount,int tPeriod, int rPeriod)
	{
		double value= amount*Math.pow(1+rPeriod, tPeriod);
		return value;
	}
	public static void main(String[] args) {
		
	}

}
