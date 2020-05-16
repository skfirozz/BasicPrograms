package Day12;

public class bros {
	static void meth(String str)
	{
		int count1=0,count2=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				count1++;
			else if(str.charAt(i)==')')
				count2++;
		}
		System.out.println(count1+" "+count2);
	}
	
	
	void open(String s)
	{
		int c1=0,c2=0;
		String s2="";
		for(int i=s.length()-1;i>=0;i++)
		{
			if(s.charAt(i)==')')
				c1++;
			else 
				c1=c1-1;
		}
	}
	void close(String s)
	{
		
	}
	public static void main(String[] args) {
		String str="(((())))))";
		meth(str);
	}

}
