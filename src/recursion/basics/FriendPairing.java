package recursion.basics;

public class FriendPairing {

    public static void main(String args[]){
        int n=2;
        boolean used[]=new boolean[n+1];
        friendPair(1,n,used,"");
    }


    public static void friendPair(int i,int n,boolean used[],String asf){
       if(i>n){
           System.out.println(asf);
           return;
       }
       if(used[i]==true){
           friendPair(i+1,n,used,asf);
       }
       else{
           used[i]=true;
           friendPair(i+1,n,used,asf+"("+i+")");
           for(int j=i+1;j<=n;j++){
              if(!used[j]){
                  used[j]=true;
                  friendPair(i+1,n,used,asf+"("+i+j+")");
                  used[j]=false;
              }
           }
           used[i]=false;
       }
    }


}
