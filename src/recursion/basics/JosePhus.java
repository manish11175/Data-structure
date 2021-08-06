package recursion.basics;

public class JosePhus {
    public static void main(String args[]){
        int n=8;
        int k=3;
        int survive=josephus(n,k);
        System.out.println(survive);

    }
    public  static int josephus(int n,int k){
        if(n==1){
            return 0;
        }
        int x=josephus(n-1,k);
        int y=(x+k)%n;

        return y;
    }
}
