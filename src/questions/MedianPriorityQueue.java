package questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianPriorityQueue {
    static class MedianPQ {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        public void add(int data) {
            if(maxHeap.size()==0 && minHeap.size()==0){
                maxHeap.add(data);

            }
            else if(maxHeap.size()==0){
                maxHeap.add(data);
            }
            else if(maxHeap.size()==0){
                minHeap.add(data);
            }
            else{
                if(data<maxHeap.peek()){
                    maxHeap.add(data);
                }
                else{
                   minHeap.add(data);
                }
//                balance(minHeap,maxHeap);
            }

        }


    }
//
//    public static void main(String[] args) {
//
//    }
//
//    public static int median(ArrayList<Integer> arr) {
//
//    }


}
