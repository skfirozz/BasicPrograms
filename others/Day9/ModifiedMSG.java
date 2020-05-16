package Day9;

import java.util.Scanner;

public class ModifiedMSG {
	static void modified(String name,String fullName,String number,String date)
	{
		String str="Hello <<name>>, We have your full name as\r\n" + 
				"<<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know\r\n"
				+ "in case of any clarification Thank you BridgeLabz 01/01/2016.";
		str=str.replaceAll("<<name>>", name);
		str=str.replaceAll("<<full name>>", fullName);
		str=str.replace("xxxxxxxxxx", number);
		str=str.replace("01/01/2016", date);
		System.out.println(str);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		String fullName=scan.nextLine();
		String number=scan.nextLine();
		String date=scan.nextLine();
		scan.close();
		modified(name, fullName, number, date);;
	}

}
