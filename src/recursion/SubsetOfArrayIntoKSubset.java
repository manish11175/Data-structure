package recursion;

import java.util.ArrayList;

public class SubsetOfArrayIntoKSubset {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int sum[] = new int[4];
		ksubsetsum(arr, 0, list, 3, sum);

	}

	public static void ksubset(int arr[], int vidx, ArrayList<ArrayList<Integer>> list, int k) {
		if (vidx == arr.length) {
			if (list.size() == k) {
				System.out.println(list);
			}
			return;
		}
		if (list.size() == 0) {
			list.add(new ArrayList<Integer>());
			list.get(0).add(arr[vidx]);
			ksubset(arr, vidx = 1, list, k);
			list.remove(0);
		} else {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).add(arr[vidx]);
				ksubset(arr, vidx + 1, list, k);
				list.get(i).remove(list.get(i).size() - 1);
			}
			if (list.size() < k) {
				list.add(new ArrayList<Integer>());
				list.get(list.size() - 1).add(arr[vidx]);
				ksubset(arr, vidx + 1, list, k);
				list.remove(list.size() - 1);
			}
		}

	}

	public static void ksubsetsum(int arr[], int vidx, ArrayList<ArrayList<Integer>> list, int k, int sum[]) {
		if (vidx == arr.length) {
			if (list.size() == k) {
				for (int i = 1; i < k; i++) {
					if (sum[i] != sum[i - 1]) {
						return;
					}
				}
				System.out.println(list);
			}
			return;
		}
		if (list.size() == 0) {
			list.add(new ArrayList<Integer>());
			list.get(0).add(arr[vidx]);
			sum[0] += arr[vidx];
			ksubsetsum(arr, vidx + 1, list, k, sum);
			list.remove(0);
			sum[0] -= arr[vidx];
		} else {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).add(arr[vidx]);
				sum[i] += arr[vidx];
				ksubsetsum(arr, vidx + 1, list, k, sum);
				sum[i] -= arr[vidx];
				list.get(i).remove(list.get(i).size() - 1);
			}
			if (list.size() < k) {
				list.add(new ArrayList<Integer>());
				list.get(list.size() - 1).add(arr[vidx]);
				sum[list.size() - 1] += arr[vidx];
				ksubsetsum(arr, vidx + 1, list, k, sum);
				sum[list.size() - 1] -= arr[vidx];
				list.remove(list.size() - 1);
				
			}
		}

	}

	public static void kPartitionSum(int[] arr, int vidx, ArrayList<ArrayList<Integer>> list, int k, int[] subsetSum) {
		if (vidx == arr.length) {
			if (list.size() == k) {
				for (int i = 1; i < k; i++) {
					if (subsetSum[i] != subsetSum[i - 1]) {
						return;
					}
				}
				System.out.println(list);
			}
			return;
		}
		if (list.size() == 0) {
			list.add(new ArrayList<Integer>());
			list.get(0).add(arr[vidx]);
			subsetSum[0] += arr[vidx];
			kPartitionSum(arr, vidx + 1, list, k, subsetSum);
			list.remove(0);
			subsetSum[0] -= arr[vidx];
		} else {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).add(arr[vidx]);
				subsetSum[i] += arr[vidx];
				kPartitionSum(arr, vidx + 1, list, k, subsetSum);
				subsetSum[i] -= arr[vidx];
				list.get(i).remove(list.get(i).size() - 1);
			}

			if (list.size() < k) {
				list.add(new ArrayList<>());
				list.get(list.size() - 1).add(arr[vidx]);
				subsetSum[list.size() - 1] += arr[vidx];
				kPartitionSum(arr, vidx + 1, list, k, subsetSum);
				subsetSum[list.size() - 1] -= arr[vidx];
				list.remove(list.size() - 1);
			}
		}
	}

}
