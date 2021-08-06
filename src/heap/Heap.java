package heap;

import java.util.*;

public class Heap {
    ArrayList<Integer> data = new ArrayList<>();


    public void add(int val) {
        this.data.add(val);
        upHeapify(this.data.size() - 1);

    }

    private void upHeapify(int ci) {
        if (ci == 0) {
            return;
        }
        int pi = (ci - 1) / 2;
        if (this.data.get(pi) < this.data.get(ci)) {
            swap(ci, pi);
            upHeapify(pi);
        }
    }

    private void swap(int ci, int pi) {
        int temp = this.data.get(ci);

        this.data.set(ci, this.data.get(pi));
        this.data.set(pi, temp);
    }

    public void display() {
        System.out.println(this.data);


    }

    public int peek() {

        return this.data.get(0);
    }

    public int size() {
        return this.data.size();
    }

    public boolean isEmpty() {
        return this.data.size() == 0 ? true : false;
    }

    public int remove() {
        swap(0, this.data.size() - 1);
        int re = this.data.remove(this.data.size()- 1);
         downHeapify(0);
         return re;
    }

    private void downHeapify(int pi) {
        int maxValue=pi;
        int lci=2*pi+1;

        if(lci<this.data.size() && this.data.get(lci)>this.data.get(maxValue)){
            maxValue=lci;
        }
        int rci=2*pi+2;
        if(rci<this.data.size() && this.data.get(rci)>this.data.get(maxValue)){
            maxValue=rci;

        }
        if(maxValue!=pi)
        {
            swap(pi,maxValue);
            downHeapify(maxValue);
        }

    }
}
