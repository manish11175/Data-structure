package recursion.basics;

public class LastIndexOccurance {
    public static void main(String args []){
        int arr[]={1,2,3,4,5,66,7,2};
       int ind= LIO(arr,0,2);
       System.out.println(ind);
    }
    public static int LIO(int arr[],int ind,int data) {
        if (ind == arr.length) {
            return -1;
        }
        int liisa = LIO(arr, ind + 1, data);
        if (liisa == -1) {
            if (arr[ind] == data) {
                return ind;
            } else {
                return -1;
            }
        }
        else{
            return liisa;
        }
    }
}
