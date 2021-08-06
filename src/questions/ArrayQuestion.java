package questions;

import java.util.*;


public class ArrayQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       String ans[] = { "act", "cat", "tac", "dog", "god", "cat" };

//		int arr[] = { 1, 2, 3, 4, 5, 6 };
//	   getAns(arr);
		fun(ans);

	}

	public static void fun(String ans[]) {

		temp[] arr = new temp[ans.length];

		for (int i = 0; i < ans.length; i++) {
			char[] a = ans[i].toCharArray();
			Arrays.sort(a);
			String ss = new String(a);
			arr[i] = new temp(ss, i);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].s + " ");
		}
		System.out.println();
		Arrays.sort(arr, new sortbyme());

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].s + " ");
		}
		System.out.println();
		System.out.print(ans[arr[0].index] + " ");

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(arr[i - 1].s)) {
				System.out.print(ans[arr[i].index] + " ");
			} else {
               System.out.println();
				System.out.print(ans[arr[i].index] + " ");
			}
		}
	}

//	public static void getAnsInO(int[] arr) {
//
//	}

	public static void getAns(int[] arr) {

		int n = arr.length;
		int ans[] = new int[n];
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j <= i * 2 && j < n; j++) {
				sum += arr[j];
			}
			ans[i] = sum;
		}
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}

class temp {
	String s;
	int index;

	public temp(String s, int i) {
		this.s = s;
		this.index = i;
	}
}

class sortbyme implements Comparator<temp> {
	public int compare(temp a, temp b) {
		if (a.s.compareTo(b.s) != 0) {
			return a.s.compareTo(b.s);
		} else {
			return a.index - b.index;
		}
	}
}

