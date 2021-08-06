package datastructure.sort;

public class QuickSort {

	public static void main(String[] args) {
   int arr[]= {4,11,7,15,17,1,2,71,7};
   quicksort(arr,0,arr.length-1);
   for(int i:arr)
   {
	   System.out.print(i+" ");
   }
	}

	public static void quicksort(int arr[], int lo, int hi) {
		if (lo < hi) {
			int pi = pivotIndex(arr, lo, hi);
			quicksort(arr, pi + 1, hi);
			quicksort(arr, lo, pi - 1);
		}
	}

	public static int pivotIndex(int arr[],int lo,int hi)
	{
		int i=lo-1;
		int pivot=arr[hi];
		for(int j=lo;j<hi;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,hi);
		return i+1;
	}

	private static void swap(int[] arr, int i, int hi) {
		int temp = arr[i];
		arr[i] = arr[hi];
		arr[hi] = temp;

	}

}
