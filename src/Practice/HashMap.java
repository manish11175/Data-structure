package Practice;


import java.util.*;


public class HashMap<k, v> {

    private class HMnode {
        k key;
        v value;

        HMnode(k key, v value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HMnode>[] buckets;
    private int size;

    HashMap() {
        buckets = new LinkedList[4];
        for (int i = 0; i < buckets.length; i++)
            buckets[i] = new LinkedList<>();
    }

    public void display() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket of " + i + " {");
            for (HMnode hmnode : buckets[i]) {
                System.out.print(hmnode.key + " : " + hmnode.value + " , ");
            }
            System.out.print("}");

            System.out.println();

        }

    }

    public int hashFunction(k key) {
        int bi = key.hashCode();
        return Math.abs(bi) % buckets.length;
    }

    public v get(k key) {
        int bi = hashFunction(key);
        HMnode hmnode = findWithInBuckets(bi, key);
        if (hmnode == null) {
            return null;
        } else {
            return hmnode.value;
        }
    }

    private HMnode findWithInBuckets(int bi, k key) {
        for (HMnode hmnode : buckets[bi]) {
            if (hmnode.key == key) {
                return hmnode;
            }
        }
        return null;
    }

    public void put(k key, v value) {
        int bi = hashFunction(key);
        HMnode hmnode = findWithInBuckets(bi, key);
        if (hmnode == null) {
            HMnode node = new HMnode(key, value);
            buckets[bi].addLast(node);
            size++;

        } else {
            hmnode.value = value;
        }

        double lambda = (size * 1.0) / buckets.length;
        if (lambda > 2.0) {
            rehash();
        }

    }

    public void rehash() {
        LinkedList<HMnode>[] oba = buckets;
        buckets = new LinkedList[2 * buckets.length];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
        for (int i = 0; i < oba.length; i++) {
            for (HMnode hmnode : oba[i]) {
                put(hmnode.key, hmnode.value);
            }
        }
//        for(int bi = 0;bi<oba.length;bi++){
//            for(int di =0;di<oba[bi].size();di++){
//                HMnode hmnode = oba[bi].get(di);
//                put(hmnode.key,hmnode.value);
//            }
//        }

    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public ArrayList<k> ketSet() {
        ArrayList<k> keys = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            for (HMnode hmnode : buckets[i]) {
                keys.add(hmnode.key);
            }
        }
        return keys;
    }

    public boolean containsKey(k key) {
        int bi = hashFunction(key);
        HMnode hmnode = findWithInBuckets(bi, key);
        if (hmnode == null) {
            return false;
        }
        return true;
    }

    public v remove(k key) {
        int bi = hashFunction(key);
        HMnode hmnode = findWithInBuckets(bi, key);
        if (hmnode != null) {
            remove(bi, key);
            size--;
            return hmnode.value;
        } else {
            return null;
        }
    }

    private void remove(int bi, k key) {
        for (int i = 0; i < buckets[bi].size(); i++) {
            if (buckets[bi].get(i).key == key) {
                buckets[bi].remove(i);
            }

        }

    }

}
