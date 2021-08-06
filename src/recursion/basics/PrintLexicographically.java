package recursion.basics;

public class PrintLexicographically {
    public static void main(String args[]) {
        int n=1000;
//        printLexico(n);
        for(int i=1;i<=9;i++){
            dfs(i,n);
        }
    }
    public static void dfs(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        for(int j=0;j<=9;j++){
            dfs(10*i+j,n);
        }
    }
//    public static  void printLexico(int n){
//
//        for(int i=1;i<=9;i++){
//            System.out.println(i);
//            printLexico(n-1,i+"");
//        }
//    }
//    private static void printLexico(int n,String ans){
//        if(ans.length()==3){
//            return;
//        }
//        for(int i=0;i<=9;i++){
//            System.out.println(ans+i);
//            printLexico(n-1,ans+i);
//        }
//    }
}