package Day9;
import java.util.Scanner;
public class Validation {
	static void validOrNot(String name,String fullName,String email,long number,String password,String id)
	{
		Validation v=new Validation();
		v.valid(name);
		v.valid(fullName);
		v.mobileValid(number);
		v.email(email);
		v.password(password);
		v.userId(id);
	}
	void password(String password)
	{
		int count1=0,counta=0,countA=0,countS=0;
		for(int i=0;i<password.length();i++)
		{
			if(password.charAt(i)>='a'&& password.charAt(i)<='z')
				counta++;
			else if(password.charAt(i)>='0'&& password.charAt(i)<='9')
				count1++;
			else if(password.charAt(i)>='A'&& password.charAt(i)<='Z')
				countA++;
			else
				countS++;
		}
		if(count1>0 && counta>0 && countA>0 && countS>0)
			System.out.println("valid");
		else
			System.out.println("password not valid ");
	}
	void userId(String id)
	{
		int count=0;
		for(int i=0;i<id.length();i++)
			if(id.charAt(i)>='a'&& id.charAt(i)<='z'||id.charAt(i)>='0'&& id.charAt(i)<='9')
			{
				count++;
			}if(count==id.length())
				System.out.println("id valid");
			else System.out.println("id not valid");
	}
	void email(String email)
	{
		String mail=email.substring(email.length()-4, email.length());
		if(mail.equals(".com"))
		{
		for(int i=6;i<email.length()-7;i++)
			if(email.charAt(i)=='@')
			{
				System.out.println("valid");
				break;
			}
		}
		else System.out.println("email not valid");
	}
	 void valid(String name)
	 {
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i) >='a' && name.charAt(i) <= 'z'||name.charAt(i) >='A' && name.charAt(i) <= 'Z'||name.charAt(i)==' ' )
				count++;
		}
		if(count==name.length())
			System.out.println("valid");
		else
			System.out.println("name"+" not valid");
	 }
	 void mobileValid(long number)
	 {
		int count=0;
		long temp=number;
		while(temp !=0)
		{
			count++;
			temp=temp/10;
		}
		if(count==10)
			System.out.println("valid");
		else System.out.println("not valid");
	 }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		String fullName=scan.nextLine();
		String email=scan.nextLine();
		String password=scan.nextLine();
		String id=scan.nextLine();
		long number=scan.nextLong();
		scan.close();
		validOrNot(name, fullName, email, number, password, id);
	}
}
