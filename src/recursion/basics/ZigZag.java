package recursion.basics;

public class ZigZag {
    public static void main(String args[]){
        int n=2;
        pzz(n);
    }
    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.println("Pre"+n);
        pzz(n-1);
        System.out.println("In"+n);
        pzz(n-1);
        System.out.println("POST"+n);

    }
}
