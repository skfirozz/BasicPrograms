package Day2;
import java.util.Scanner;
public class WindChill {
	static void wind(double temp,double speed)
	{
		double wind = 35.74+0.5215*temp+(0.4275*temp-35.75)*Math.pow(speed, 0.16);
		System.out.println(wind);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double temp=scan.nextDouble();
		double speed=scan.nextDouble();
		scan.close();
		wind(temp, speed);
	}
}
