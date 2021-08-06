package array;
import java.util.*;

public class SpiralPrint {

    public static void main(String args[]){
//        List<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer>arr1=new ArrayList<>();
        arr1.add(19675);

        arr1.add(-521595368);
        arr1.add( 1424268980);
        System.out.print(maxset(arr1));
//        arr.add(arr1);
//        ArrayList<Integer>arr2=new ArrayList<>();
//        arr2.add(4);
//        arr2.add(5);
//        arr2.add(6);
//        arr.add(arr2);
//        ArrayList<Integer>arr3=new ArrayList<>();
//        arr3.add(7);
//        arr3.add(8);
//        arr3.add(9);
//        arr.add(arr3);
//        System.out.print(spiralOrder(arr));


    }








    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {


        int sum=0;
        List<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=1;i<=A;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            for(int j=0;j<A;j++){
                arr.add(++sum);
            }
            list.add(arr);
        }

        ArrayList<Integer>ans=spiralOrder(list);
        ArrayList<ArrayList<Integer>>ans1=new ArrayList<>();
        for(int i=0;i<A;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            for(int j=i*A;j<A*i+A;j++){
                arr.add(ans.get(j));
            }
            ans1.add(arr);
        }
        return ans1;

    }
    public static  ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer>ans=new ArrayList<>();

        int row=A.size();
        int cols=A.get(0).size();
        int top=0;
        int bottom=row-1;
        int right=cols-1 ;
        int left=0;
        int dir=0;

        while(top<=bottom && left<=right){
            if(dir==0 ){
                for(int i=left;i<=right;i++){
                    ans.add(A.get(top).get(i));
                }
                dir=1;
                top++;
            }
            else if(dir==1){
                for(int i=top;i<=bottom;i++){
                    ans.add(A.get(i).get(right));
                }
                right--;
                dir=2;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                    ans.add(A.get(bottom).get(i));
                }
                bottom--;
                dir=3;
            }
            else if(dir==3){
                for(int i=bottom;i>=top;i--){
                    ans.add(A.get(i).get(left));
                }
                left++;
                dir=0;
            }
        }
        return ans;
    }
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();

        int start = 0;
        int end = 0;
        long sum = 0;
        long max = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < A.size(); i++) {

            if (A.get(i) < 0) {

                if (sum > max) {
                    max = sum;
                    sum = 0;
                    end = i - 1;
                    if (temp != 0) {
                        start = temp + 1;
                        temp = i;
                    } else {
                        start = 0;
                        temp = i + 1;
                    }
                }

            }
            if (sum > max) {
                max = sum;
                sum = 0;
                end = i - 1;
                if (temp != 0) {
                    start = temp + 1;
                    temp = i;
                } else {
                    start = 0;
                    temp = i + 1;
                }
            }
            else {
                sum += A.get(i);

            }
        }
        if (max < 0) {
            return ans;
        } else {
            for (int i = start; i <= end; i++) {
                ans.add(A.get(i));
            }

            return ans;
        }
    }

//    public static  ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
//        ArrayList<Integer>ans=new ArrayList<>();
//
//        int row=A.size();
//        int cols=A.get(0).size();
//        int top=0;
//        int bottom=row-1;
//        int right=cols-1 ;
//        int left=0;
//        int dir=0;
//
//        while(top<=bottom && left<=right){
//            if(dir==0 ){
//                for(int i=left;i<=right;i++){
//                    ans.add(A.get(top).get(i));
//                }
//                dir=1;
//                top++;
//            }
//            else if(dir==1){
//                for(int i=top;i<=bottom;i++){
//                    ans.add(A.get(i).get(right));
//                }
//                right--;
//                dir=2;
//            }
//            else if(dir==2){
//                for(int i=right;i>=left;i--){
//                    ans.add(A.get(bottom).get(i));
//                }
//                bottom--;
//                dir=3;
//            }
//            else if(dir==3){
//                for(int i=bottom;i>=top;i--){
//                    ans.add(A.get(i).get(left));
//                }
//                left++;
//                dir=0;
//            }
//        }
//        return ans;
//    }
//


}

