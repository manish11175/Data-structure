package questions;

import java.util.*;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Pair implements Comparable<Pair>{
    private int first;
    private int second;
    Pair(int key,int value){
        super();
        this.first=key;
        this.second=value;
    }
    public int getKey(){
        return this.first;
    }
    public int getValue(){
        return this.second;
    }

    @Override
    public String toString(){
        return first+" "+second;
    }
    @Override
    public int compareTo(Pair o) {
        if (this.first-o.first==0){
            return this.second-o.second;
        }
        return this.first-o.first;
    }
}
public class Room {
   public static  void main(String args[]){

       List<Pair> booking =new ArrayList<>();
       booking.add(new Pair(2,3));

       booking.add(new Pair(5,3));
       booking.add(new Pair(5,3));
       booking.add(new Pair(6,3));
       booking.add(new Pair(3,6));
       booking.add(new Pair(3,4));
       Collections.sort(booking);
       booking.forEach(System.out::println);
   }

}
