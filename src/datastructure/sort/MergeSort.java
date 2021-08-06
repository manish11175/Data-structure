package datastructure.sort;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 36, 3, 4, 5 };
		mergesort(arr, 0, arr.length-1);
		for (int val : arr) {
			System.out.print(val+" ");
		}
	}

	public static void mergesort(int arr[], int l, int r) {
		if (l < r) {
			int mid = l + (r-l) / 2;
	        mergesort(arr, l, mid);
			mergesort(arr, mid + 1, r);
			mergeTwoSortedArrays(arr, l, mid, r);
		}

	}
	

	private static void mergeTwoSortedArrays(int[] arr, int l, int m, int r) {

		int size = m - l + 1;
		int size2 = r - m;
		int arr1[] = new int[size];
		int arr2[] = new int[size2];
		for (int i = 0; i < size; i++) {
			arr1[i] = arr[l + i];
		}
		for (int i = 0; i < size2; i++) {
			arr2[i] = arr[m + i + 1];
		}
		int i = 0, j = 0;
		int k = l;
		while (i < size && j < size2) {
			if (arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < size) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < size2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}

	}


}
