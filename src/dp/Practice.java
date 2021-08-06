package dp;

public class Practice {
    public static void main(String [] args){
       int n=4;
        int strg[]=new int[n];
      System.out.println(  fiboRecursion(1));
    }
    public static int fiboRecursion(int n){
        if(n==1 || n==2){
            return n-1;
        }
        int f1=fiboRecursion(n-1);
        int f2=fiboRecursion(n-2);
        return  f1+f2;
    }
    public static int fiboDp(int n,int strg[]){

        if(n==1 || n==2){
            return n-1;
        }
        if(strg[n]!=0){
            return strg[n];
        }
        int f1=fiboDp(n-1,strg);
        int f2=fiboDp(n-2,strg);
        int f=  f1+f2;
        strg[n]=f1;
        return f;
    }
}
