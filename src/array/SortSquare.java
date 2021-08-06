package array;

import java.util.ArrayList;

public class SortSquare {
    public static void main(String args[]){
        int arr[]={-5,-4,-2,-1,0,1,2,3,4,5,6,};
        int left=0;
        int right = 0;
        int i=0;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<arr.length){
            if(arr[i]>=0){
                left=i;
                right=i+1;
                break;
            }
            i++;
        }
        while(left>=0 && right< arr.length ){
            if(Math.abs(arr[left])<=Math.abs(arr[right])){
                list.add(arr[left]* arr[left]);
                left--;
            }
            else{
                list.add(arr[right]* arr[right]);
                right++;
            }

        }
        while(left>=0){
            list.add(arr[left]* arr[left]);
            left--;
        }
        while(right< arr.length){
            list.add(arr[right]* arr[right]);
            right++;
        }
        System.out.println(list);
    }
}
