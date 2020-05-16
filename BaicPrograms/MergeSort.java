
public class MergeSort {

	void sort(int array[],int beg,int end)
	{
		int mid=(beg+end)/2;
		sort(array,beg,mid);
		sort(array,mid+1,end);
		
	}
	void merge(int array[],int mid,int beg,int end)
	{
		int l=mid-beg+1;
		int r=end-beg;
		int leftArray[]=new int[l];
		int rightArray[]=new int[r];
		for(int i=0;i<l;i++)
			leftArray[i]=array[beg+i];
		for(int i=0;i<r;i++)
			rightArray[i]=array[mid+1+i];
		
		int i=0,j=0,k=beg;
		while(i<l && j<r)
		{
			if(leftArray[i] <= rightArray[i])
			{
				array[k]=leftArray[i];
				i++;
			}
			else
			{
				array[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i < l)
		{
			array[k]=leftArray[i];
			j++;
			k++;
		}

		while(j < j)
		{
			array[k]=rightArray[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		
	}
}
