package recursion.basics;
import java.util.*;

public class KeypadCombination {
    public static void main(String args[]){
        ArrayList<String>res=keyCombination("123");
        System.out.print(res);
    }
    public static ArrayList<String> keyCombination(String number){
        if(number.length()==0){
            ArrayList<String>bre= new ArrayList<String>();
            bre.add("");
            return bre;
        }
        char ch=number.charAt(0);
        String rn=number.substring(1);
        ArrayList<String>kpc=keyCombination(rn);
        ArrayList<String> res=new ArrayList<>();
        String str=getKey(ch);
        for(int i =0;i<str.length();i++){
            char c=str.charAt(i);
            for(String s:kpc){
                res.add(c+s);
            }
        }
     return res;
    }
    private static String getKey(char ch){
        switch(ch){
            case '1':
               return "abc";
            case '2':
                return "def";
            case '3':
                return "ghi";
            default:
                return "xyz";
        }

    }

}
