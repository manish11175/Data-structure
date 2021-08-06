package array;

public class MergeSort {
    public static void main(String args[]) {
        int arr[] = {1, 23, 2, 34, 2, 12};

        mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr, start, end);
    }

    private static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];// to store temp element
        int i = start;
        int j = mid + 1;
        int k = 0;//index to store element
        while (i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp[k]=arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;

            }
        }
        //add remaining element from left side
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(i=start;i<=end;i++){
            arr[i]=temp[i-start];
        }
    }

}
