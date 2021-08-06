package oops.singleton;
import java.util.*;
class Pair<Key,Value>{
    private Key first;
    private Value second;
    public Pair(Key k ,Value v){
        this.first=k;
        this.second=v;
    }
    public  Key getKey(){
        return this.first;
    }
    public Value getValue(){
        return this.second;
    }
}
public class Main {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(isItPossible(a,b,c,d));
    }
    static LinkedList<Pair<Integer,Integer>> pairs = new LinkedList<>();

    public static String isItPossible(Integer a, Integer b, Integer c, Integer d){
        pairs.addLast(new Pair<Integer, Integer>(a,b));
        while (!pairs.isEmpty()){
            Pair<Integer,Integer> pair = pairs.poll();
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if(key.equals(a) &&
                    value.equals(b)){
                return "YES";
            }
            int sum=key+value;
            if (sum<=c){
                pairs.addLast(new Pair<Integer, Integer>(sum,value));
            }
            if (sum<=d){
                pairs.addLast(new Pair<Integer, Integer>(key,sum));
            }

        }

        return "NO";
    }
}
