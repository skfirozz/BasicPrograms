package Day10;

public class time {
	static void dif(String it,String ft)
	{
		String h1="",h2="",m1="",m2="",s1="",s2="";
		for(int i=0;i<it.length();i++)
		{
			if(i<2)
				h1=h1+it.charAt(i);
			else if(i>2 && i<5)
				m1=m1+it.charAt(i);
			else if(i>5 && i<=it.length())
				s1=s1+it.charAt(i);
		}
		for(int i=0;i<ft.length();i++)
		{
			if(i<2)
				h2=h2+ft.charAt(i);
			else if(i>2 && i<5)
				m2=m2+ft.charAt(i);
			else if(i>5 && i<=it.length())
				s2=s2+ft.charAt(i);
		}
		int n1=conv(h1);
		int n2=conv(h2);
		int n3=conv(m1);
		int n4=conv(m2);
		int n5=conv(s1);
		int n6=conv(s2);
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
		ti(n1, n2, n3, n4, n5, n6);
	}
	static void ti(int n1,int n2,int n3,int n4,int n5,int n6 )
	{
		int h=0,m=0,s=0;
		if(n1 > n2)
		{
			h=n1-n2;
			h=12-h;
			System.out.println(h);
		}
		else h=Math.abs(n2-n1);
		if(n3 > n4)
		{
			m=n3-n4;
			m=60-m;
		}
		else m=Math.abs(n3-n4);
		if(n5 > n6)
		{
			s=n5-n6;
			s=12-s;
		}
		else s=Math.abs(n6-n5);
		if(s > n5)
			m=m-1;
		if(m > n3)
			h=h-1;
		String str=h+":"+m+":"+s;
		System.out.println(str);
	}
	public static void main(String[] args) {
		String it="10:20:30";
		String ft="11:16:54";
		dif(it, ft);
	}
	static int conv(String s)
	{
		int n1=Integer.parseInt(s);
		return n1;
	}

}
