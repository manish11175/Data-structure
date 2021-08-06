package PriorityQueue;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
//       
//		pq.add(1);
//		pq.add(3);
//		pq.add(6);
//		System.out.println(pq);
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
//		System.out.println(pq.isEmpty());
//		System.out.println(pq.remove());
//		System.out.println(pq);
//		largestKElement(Arrays.asList(12, 34, 45, 18, 60, 1), 3);
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
		ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
		arr1.add(1);
		arr1.add(4);
		arr2.add(3);
		arr2.add(5);
		arr.add(arr2);
		arr.add(arr1);
		
		mergerKSortedList(arr);
	}

	public static void largestKElement(List<Integer> arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.addAll(arr);
//	    System.out.println(pq);

		while (k-- > 0) {
			System.out.println(pq.poll());
		}

	}

	public static void largestKElement2(List<Integer> arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.addAll(arr);
//	    System.out.println(pq);

		while (k-- > 0) {
			System.out.println(pq.poll());
		}

	}

	public static void almostsorted(int arr[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			if(i<k+1) {
				pq.add(arr[i]);
			
			}
			else {
				arr[i-k-1]=pq.remove();
				pq.add(arr[i]);
			}
			
		}
		for(int i=arr.length-k-1;i<arr.length;i++ ) {
			arr[i]=pq.remove();
		}
		for(int val:pq) {
			System.out.print(val+" ");
		}
	}
	
	
	public static void mergerKSortedList(ArrayList<ArrayList<Integer>>list) {
		
		PriorityQueue<ArrayList<Integer>>pq=new PriorityQueue<>();
		for(ArrayList<Integer>i:list) {
			pq.add(i);
		}
		
		System.out.println(pq);
		
		
		
	}
}
