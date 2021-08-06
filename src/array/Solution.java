package array;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();

        String data=sc.nextLine();
        for(String s:data.split("_")){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        int n=sc.nextInt();

        sc.nextLine();
        for(int i=0;i<n;i++){

            String q=sc.nextLine();

            getAns(q,map);
        }
    }
    public static void getAns(String q,HashMap<String,Integer> map){
        System.out.println(map.get(q));
    }
}
