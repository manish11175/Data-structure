package recursion.basics;
import java.util.*;
import java.io.*;
public class TowerOfHanoi {
    public static void main(String args []){
        toh(3,'A','B','C');
    }
    public static void toh(int disk,char start,char end,char helper){
        if(disk==0){
            return;
        }

        toh(disk-1,start,helper,end);
        System.out.println(disk+"-"+start+"->"+end);
        toh(disk-1,helper,end,start);
    }
}
