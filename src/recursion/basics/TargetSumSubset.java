package recursion.basics;

import java.util.ArrayList;

public class TargetSumSubset {
    public static void main(String args []){
        int arr[]={10,20,30,40,50,60};
        int target=60;

        printTSS(arr,0,target,0,"");

    }
    public static void printTSS(int arr[],int ind,int target,int sum,String ans){
        if(ind==arr.length ){
            if(sum==target){
                System.out.println(ans);
            }
            return;
        }

       printTSS(arr,ind+1,target,sum+arr[ind],ans+arr[ind]);
        printTSS(arr,ind+1,target,sum,ans);

    }

}
