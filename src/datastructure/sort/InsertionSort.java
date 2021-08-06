package datastructure.sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-3,12,-24,22, 3, 4, 5,-1,-2,-3 };
		insertionSort(arr);
		
		
		
	}
	public static void insertionSort(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;++i)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=key;
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	

}
