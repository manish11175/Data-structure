package recursion.basics;

import java.util.Scanner;

public class Recursion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("factorial of "+n+  " is  "+factorial(n));
    }
    public static int factorial(int n){

        if(n==0){
            return 1;
        }

        int fnm1=factorial(n-1);
        int facn=n*fnm1;
        return facn;
    }
}
