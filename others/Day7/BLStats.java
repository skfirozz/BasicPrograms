package Day7;

public class BLStats {
	public static double max(double array[]) 
	{
		double max=0;
		for(int i=0;i<array.length;i++)
		{
			if(max < array[i])
				max=array[i];
		}
		return max;
	}
	public static double min(double array[])
	{
		double min=array[1];
		for(int i=0;i<array.length;i++)
		{
			if(min > array[i])
				min=array[i];
		}
		return min;
	}
	public static double mean(double array[])
	{
		double total=0.0;
		for(int i=0;i<array.length;i++)
			total=total+array[i];
		double mean=total/array.length;
		return mean;
	}
	public static double variance(double array[])
	{
		double variance=0;
		double mean=mean(array);
		for(int i=0;i<array.length;i++)
		{
			variance=variance+(array[i]-mean);
		}
				return variance;
	}
	public static double standardDeviation(double array[])
	{
		double mean=mean(array);
		mean=Math.sqrt(mean);
		return mean;
	}
	public static double median(double array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-i;j++)
			{
				if(array[i] > array[j])
				{
					double temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		double median=0;
		int size=array.length/2;
		if(array.length%2==0)
		{
			median=array[size]+array[size+1];
		}
		else
			median=array[size+1];
		return median;
	}
	
	private static void validateNotNull(Object x) {
        if (x == null)
            throw new IllegalArgumentException("argument is null");
    }
	 public static void plotLines(double[] a) {
	        validateNotNull(a);
	        int n = a.length;
	        StdDraw.setXscale(-1, n);
	        StdDraw.setPenRadius();
	        for (int i = 1; i < n; i++) {
	            StdDraw.line(i-1, a[i-1], i, a[i]);
	        }
	    }
	 public static void plotPoints(double[] a) {
	        validateNotNull(a);
	        int n = a.length;
	        StdDraw.setXscale(-1, n);
	        StdDraw.setPenRadius(1.0 / (3.0 * n));
	        for (int i = 0; i < n; i++) {
	            StdDraw.point(i, a[i]);
	        }
	    }
	 
	 public static void plotBars(double[] a) {
	        validateNotNull(a);
	        int n = a.length;
	        StdDraw.setXscale(-1, n);
	        for (int i = 0; i < n; i++) {
	            StdDraw.filledRectangle(i, a[i]/2, 0.25, a[i]/2);
	        }
	    }
	public static void main(String[] args) {
		double array[]= {1.4,4.67,32.33,5.3342,435.354,34324.423,545.2432,335.35,4324.546};
		System.out.println(mean(array));
		System.out.println(median(array));
		System.out.println(standardDeviation(array));
		System.out.println(variance(array));
		System.out.println(min(array));
		System.out.println(max(array));
	}

}
