package recursion.basics;

public class FirstIndexOccurance {
    public static void main(String args []){
        int arr[]={12,2,2,3,1,2,1,2,3,4,6,7,8,9,7,5};
//        FIO(arr,0,15);
          System.out.println(FIO1(arr,0,5));
    }
    public static void FIO(int arr[],int ind,int data){
        if(ind== arr.length){
            System.out.print("this data is not  present");
            return;
        }
        if(arr[ind]==data){
            System.out.print(ind);
            return;
        }
        FIO(arr,ind+1,data);
    }
    public static int FIO1(int arr[],int ind,int data){
        if(ind==arr.length){
            return -1;
        }
        int f=FIO1(arr,ind+1,data);
        if(arr[ind]==data){
            return ind;
        }
        else{
            return f;
        }
    }
}
