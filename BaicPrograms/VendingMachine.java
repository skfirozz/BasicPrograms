import java.util.Scanner;
public class VendingMachine {

	int machine(int amount)
	{
		int money[]= {1,2,5,10,50,100,500,1000};
		int tNotes=0;
		int j=-1;
		int listNotes[]=new int[8];
		for(int i=money.length-1;i>=0;i--)
		{
			int notes=0;
				if(amount >=money[i] )
				{
					int n=amount/money[i];
					notes++;
					j++;
					notes=notes*n;
					listNotes[j]=money[i];
//					System.out.println(notes);
					amount=amount % money[i];
//					System.out.println(amount);
				}
				tNotes+=notes;
				if(amount==0)
					break;
		}
		for(int i=0;i<listNotes.length;i++)
		{
			if(listNotes[i]!=0)
				System.out.print(listNotes[i]+" ");
		}
		System.out.println();
		return tNotes;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int amount=scan.nextInt();
		scan.close();
		VendingMachine v=new VendingMachine();
		System.out.println(v.machine(amount));
	}
}
