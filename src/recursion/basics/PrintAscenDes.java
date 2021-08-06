package recursion.basics;

public class PrintAscenDes {
    public static  void main(String agrs[]){
        PDI(3);
    }
    public static void PDI(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        PDI(num-1);
        System.out.println(num);
    }














    public static void printIncreasing(int num){
        if(num==0){
            return;
        }
        printIncreasing(num-1);
        System.out.print(num+" ");
    }
    public static void printDescending(int num){
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        printDescending(num-1);

    }
}