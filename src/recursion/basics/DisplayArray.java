package recursion.basics;

public class DisplayArray {
    public static void main(String args[]){
        int arr[]= {1,2,3,45,5};
        display(arr,0);
        System.out.println();
        reverse(arr,0);
    }
    public static  void display(int arr[],int ind){
        if(ind==arr.length){
            return;
        }
        System.out.print(arr[ind]+" ");
        display(arr,ind+1);
    }
    public static void reverse(int arr[],int ind){
        if(ind==arr.length){
            return;
        }
        reverse(arr,ind+1);
        System.out.print(arr[ind]+" ");
    }
}
