package Day8;
public class me {
	static void div(int array[],int lb,int up)
	{
		if(lb < up)
		{
			int mid=(lb+up)/2;
			div(array,lb,mid);
			div(array,mid+1,up);
			merge(array,lb,mid,up);
		}
	}
	 static void merge(int array[], int lb, int mid, int up)
	 {
		int n1=mid-lb+1;
		int n2=up-mid;
		int array1[]=new int[n1];
		int array2[]=new int[n2];
		for(int i=0;i<n1;i++)
			array1[i]=array[lb+i];
		for(int i=0;i<n2;i++)
			array2[i]=array[mid+1+i];
		int i=0,j=0,k=lb;
		while(i< n1 && j< n2)
		{
			if(array1[i]>=array2[j])
			{
				array[k]=array2[j];
				j++;k++;
			}
			else
			{
				array[k]=array1[i];
				i++;
				k++;
			}
		}
		while(i<n1)
		{
			array[k]=array1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			array[k]=array2[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		int array[]= {3,32,44,1,43,64,5,32,42,90,9,8,6};
		div(array, 0, array.length-1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
