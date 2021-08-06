package recursion.basics;

import java.sql.Array;
import java.util.ArrayList;

public class AllIndex {
    public static void main(String args []){
        int arr[]={1,2,3,2,1,2,4,5,6,7,5,3,};
        int data=2;
//        ArrayList<Integer> indices=findAllIndices(arr,0,data);
//        System.out.print(indices);
        int allind[]=findAllIndices1(arr,0,data,0);
        for(int i :allind){
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> findAllIndices(int arr[],int ind ,int data){
        if(ind==arr.length){
            ArrayList<Integer> res=new ArrayList<>();
            return res;
        }
        if(arr[ind]==data){
            ArrayList<Integer> iarr=findAllIndices(arr,ind+1,data);
            iarr.add(ind);
            return iarr;
        }
        else{
            ArrayList<Integer> iarr=findAllIndices(arr,ind+1,data);
            return iarr;
        }

    }
    public static int[] findAllIndices1(int arr[],int ind ,int data,int fsf){
        if(ind==arr.length){
            return new int[fsf];
        }
        if(arr[ind]==data){
            int [] iarr=findAllIndices1(arr,ind+1,data,fsf+1);
            iarr[fsf]=ind;
            return iarr;
        }
        else{
            int [] iarr=findAllIndices1(arr,ind+1,data,fsf);
            return iarr;
        }

    }

}
