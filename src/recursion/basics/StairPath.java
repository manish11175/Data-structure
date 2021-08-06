package recursion.basics;
import TwoDArray.A;

import java.util.*;
public class StairPath {
    public static void main(String args[]){
        int n=4;
        ArrayList<String>path=getStairpath(n);
        System.out.print(path);
    }
    public static ArrayList<String> getStairpath(int n){
     if(n==0){
         ArrayList<String>bre=new ArrayList<>();
         bre.add("");
         return bre;
     }
     else if(n<0){
         return new ArrayList<String>();
     }

        ArrayList<String>path1=getStairpath(n-1);
        ArrayList<String>path2=getStairpath(n-2);
        ArrayList<String>path3=getStairpath(n-3);

        ArrayList<String>path=new ArrayList<>();
        for(String s:path1){
            path.add("1"+s);
        }
        for(String s:path3){
            path.add("3"+s);
        }
        for(String s:path2){
            path.add("2"+s);
        }
        return path;
    }
}
