package recursion.basics;

public class Permutation {
    public static void main(String args []){
        permutation("abcd","");
    }
    public static void permutation(String que,String ans){
        if(que.length()==0){
            System.out.print(ans+" ");
            return;
        }

        for(int i=0;i<que.length();i++){
            char ch=que.charAt(i);
            String rs=que.substring(0,i)+que.substring(i+1);
            permutation(rs,ans+ch);
        }

    }

}
