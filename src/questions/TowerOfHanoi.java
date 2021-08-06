package questions;

public class TowerOfHanoi {
    public static void main(String[] args) {
   TOH(3);
    }

    public static void TOH(int n) {

        towerOfHanoi('A','B','C',n);



    }
    private static void  towerOfHanoi(char source,char destination,char helper,int n){

        if(n==0){
            return;
        }
        towerOfHanoi(source,helper,destination,n-1);
        System.out.println("move disk "+n+" from rod "+source+" to "+destination);
        towerOfHanoi(helper,destination,source,n-1);


    }

}
