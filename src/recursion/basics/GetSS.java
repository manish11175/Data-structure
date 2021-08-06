package recursion.basics;
import TwoDArray.A;

import java.io.*;
import java.util.*;
public class GetSS {
  public static void main(String args []){
      String str="abc";
      ArrayList<String> Sub=getSS1(str); //"" added
//      ArrayList<String> Sub=getSS(str); // do not add " "
      System.out.println(Sub);
  }
  public static ArrayList<String> getSS(String str){
      if(str.length()==0){
          return new ArrayList<String>();
      }
      ArrayList<String>res=new ArrayList<>();
         char ch=str.charAt(0);
          String rs=str.substring(1);
          ArrayList<String> srs=getSS(rs);
//          ArrayList<String>res=new ArrayList<>();
          res.add(ch+"");
          for(String s:srs){
            res.add(ch+s);
            res.add(s);
          }
//          System.out.print(res);
          return res;
  }

    public static ArrayList<String> getSS1(String str){
        if(str.length()==0){
            ArrayList<String> bre=new ArrayList<>();
            bre.add("");
            return bre;
        }
        ArrayList<String>res=new ArrayList<>();
        char ch=str.charAt(0);
        String rs=str.substring(1);
        ArrayList<String> srs=getSS1(rs);
        for(String s:srs){
            res.add(ch+s);
            res.add(s);
        }
        return res;
    }
}
