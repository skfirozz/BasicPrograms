package Day3H;

public class OneToHundred {
	void finding(int array[])
	{
		int	value=0;
		for(int i=0;i<array.length;i++)
		{
			int count=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				count++;
				if(count>1)
				{
					value=i;
					break;
				}
			}
		}
		System.out.println(array[value]);
	}
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,6,7,8,9};
		OneToHundred o=new OneToHundred();
		o.finding(array);
		}
	}


