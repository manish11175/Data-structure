import java.util.*;

public class Solution {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int num= scn.nextInt();
        int temp=num;
        int sod=0;
        int pod=1;
        int count=0;
        while(num>0){
            count++;
            sod=sod+(num%10);
            pod=pod*(num%10);
            num=num/10;
        }
        if(temp==(pod+sod)){
            System.out.println(temp +" is a "+count+" digit special number");
        }
        else{
            System.out.println(temp +" is not a "+count+" digit special number");
        }
    }
}
