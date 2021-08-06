package questions;

public class SecondMaximum {
    public static void main(String args[]){
        int arr[]={1,2,4,3,4,5,6,7,7,27,9,10,12,12,2,3,12,12,12,1,21,1,1,1,21,12,22,2154,23,25,26};
       int fmax=Math.max(arr[0],arr[1]);
       int smax=Math.min(arr[0],arr[1]);
       for(int i=2;i< arr.length;i++){
           if(arr[i]>fmax){
               smax=fmax;
               fmax=arr[i];

           }
           else{
               smax=Math.max(smax,arr[i]);
           }
       }
       System.out.println(fmax+" "+smax);
    }
}
