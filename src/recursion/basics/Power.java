package recursion.basics;

public class Power {

    public static void main(String args[]){
        int n=20;
        int x=2;
        int p=logrithmicPower(x,n);
        System.out.println(p);
    }

    public static int logrithmicPower(int x,int n){

        if(n==0){
            return 1;
        }
        int pnm1=logrithmicPower(x,n/2);
        int pn=pnm1*pnm1;
        if(n%2==1){
            pn=pn*x;
        }

        return pn;

    }


    public  static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int pnm1=power(x,n-1);
        int pn=x*pnm1;
        return pn;
    }
}
