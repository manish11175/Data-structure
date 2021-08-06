//package hashmap;
//
//import java.util.*;
//
//public class Util {
//
//	public static void main(String[] args) {
////		HashMap<String, Integer> hashmap = new HashMap<>();
////
////		hashmap.put("cat", 2);
////		System.out.println(hashmap.get("cat"));
//
//		int arr[] = { 13, 1, 2, 3, 4, 12, 6, 7, 8, 9, 10, 11 };
//		int arr1[] = { 1, 2, 2, 2, 3, 51 };
//
//		ArrayList<ArrayList<String>> res = anagramGroup(Arrays.asList("cat", "tac", "act", "god", "dog","tac","cat"));
//		String str[]= {"cat", "tac", "act", "god", "dog","cat", "tac", "act", "god", "dog","tac","cat"};
//		anagrams(str);
//		//System.out.println(data);
//		//
//		//System.out.println(longestUniqueSubstring("mmanishpppppppppppppppppppppppppnfhvsdhfcbdskjfvbdfjksvkjbfvg"));
////		System.out.println(res);
////		HashMapClient<> client=
////		System.out.println(twoSum(Arrays.asList(1,2,3,4,5,6),8));
////		longestSequence2(arr);
////		intersection(arr, arr1);
//		// frequency(arr);
//	}
//
//	public static ArrayList<ArrayList<String>> anagramGroup(List<String> list) {
//
//		Map<Map<Character, Integer>, ArrayList<String>> mainmap = new HashMap<>();
//
//		for (String str : list) {
//			Map<Character, Integer> map = new HashMap<>();
//
//			for (int i = 0; i < str.length(); i++) {
//				if (map.containsKey(str.charAt(i))) {
//					map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
//				} else {
//					map.put(str.charAt(i), 1);
//				}
//
//			}
//
//			if (mainmap.containsKey(map)) {
//				mainmap.get(map).add(str);
//
//			} else {
//
//				ArrayList<String> res = new ArrayList<>();
//				res.add(str);
//				mainmap.put(map, res);
//
//			}
//		}
//		ArrayList<ArrayList<String>> res = new ArrayList<>();
//
//		for (ArrayList<String> a : mainmap.values()) {
//			res.add(a);
//		}
//		return res;
//	}
//
//	public static void anagrams(final String[] A) {
//
//	        HashMap<HashMap<Character,Integer>,ArrayList<Integer>>mainmap=new HashMap<>();
//
//	        for(int j=0;j<A.length;j++){
//	            HashMap<Character,Integer> map=new HashMap<>();
//	            for(int i=0;i<A[j].length();i++){
//	            if(map.containsKey(A[j].charAt(i))){
//
//	                    map.put(A[j].charAt(i),map.get(A[j].charAt(i))+1);
//	            }
//	            else{
//	                    map.put(A[j].charAt(i),1);
//	            }
//	            }
//
//	            if(mainmap.containsKey(map)){
//	                mainmap.get(map).add(j+1);
//	            }
//	            else{
//	                ArrayList<Integer>res=new ArrayList<>();
//	                res.add(j+1);
//	                mainmap.put(map,res);
//	            }
//
//	        }
//
//	       System.out.println(mainmap.values());
//	    }
//	public static int longestUniqueSubstring(String s) {
//		int max_length = Integer.MIN_VALUE;
//		int start = 0;
//		HashMap<Character, Integer> hashmap = new HashMap<>();
//		for (int end = 0; end < s.length(); end++) {
//			if (hashmap.containsKey(s.charAt(end))) {
//				start = Math.max(start, hashmap.get(s.charAt(end)) + 1);
//				hashmap.put(s.charAt(end), end);
//			} else {
//				hashmap.put(s.charAt(end), end);
//			}
//			max_length = Math.max(max_length, end - start + 1);
//		}
//
//		return max_length;
//	}
//
////	public static  Pair<Integer,Integer> twoSum(List<Integer>list, int target){
////
////		Set<Integer>set=new HashSet<>();
////		for(int a:list) {
////			int num=target-a;
////			if(set.contains(num)) {
////				return new Pair<>(num,a);
////
////			}
////			else {
////				set.add(a);
////			}
////			return new Pair<>(-1,-1);
////		}
////	}
////
//	public static void longestSequence2(int[] arr) {
//		HashMap<Integer, Boolean> map = new HashMap<>();
//		for (int val : arr) {
//			map.put(val, false);
//		}
//		for (int val : arr) {
//			if (map.containsKey(val - 1) == false) {
//				map.put(val, true);
//			}
//		}
//		int max = 0;
//		int sidx = -1;
//		for (int val : arr) {
//			int count = 1;
//			if (map.get(val) == true) {
//				while (map.containsKey(val + count)) {
//					count++;
//				}
//				if (count > max) {
//					max = count;
//					sidx = val;
//				}
//			}
//
//		}
//		System.out.println(sidx + " " + max);
//	}
//
//	public static void longestSequence(int[] arr) {
//		HashMap<Integer, Boolean> map = new HashMap<>();
//
//		for (int i : arr) {
//			map.put(i, false);
//		}
//		for (int i : arr) {
//			if (map.containsKey(i - 1) == false) {
//				map.put(i, true);
//			}
//
//		}
//
//		int sidx = -1;
//		int max = 0;
//
//		for (int val : arr) {
//			int count = 1;
//			if (map.get(val) == true) {
//				while (map.containsKey(val + count)) {
//					count++;
//				}
//				// count--;
//				if (count > max) {
//					max = count;
//					sidx = val;
//				}
//			}
//		}
//		System.out.println(sidx + " " + max);
//	}
//
//	public static void longestSequence1(int[] arr) {
//		HashMap<Integer, Boolean> map = new HashMap<>();
//		for (int val : arr) {
//			map.put(val, false);
//		}
//
//		for (int val : arr) {
//			if (map.containsKey(val - 1) == false) {
//				map.put(val, true);
//			}
//		}
//
//		int sidx = -1;
//		int maxCount = 0;
//		for (int val : arr) {
//			int count = 1;
//			if (map.get(val) == true) {
//				while (map.containsKey(val + count)) {
//					count++;
//				}
//				// count--;
//				if (count > maxCount) {
//					maxCount = count;
//					sidx = val;
//				}
//			}
//		}
//
//		System.out.println(sidx + " " + maxCount);
//	}
//
//	private static void frequency(int arr[]) {
//		HashMap<Integer, Integer> hmap = new HashMap<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (!hmap.containsKey(arr[i])) {
//				hmap.put(arr[i], 1);
//			} else {
//				hmap.put(arr[i], hmap.get(arr[i]) + 1);
//
//			}
//		}
//		System.out.println(hmap);
//	}
//
//	private static void getCommon(int[] arr, int[] arr1) {
//
//		HashMap<Integer, Integer> hmap = new HashMap<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (!hmap.containsKey(arr[i])) {
//				hmap.put(arr[i], 1);
//			} else {
//				hmap.put(arr[i], hmap.get(arr[i]) + 1);
//
//			}
//		}
//		System.out.println(hmap);
////		for(int i=0;i<arr1.length;i++) {
////			if(hmap.containsKey(arr1[i])) {
////				System.out.print(arr1[i]+" ");
////				hmap.remove(arr1[i]);
////			}
////
////		}
////		System.out.println();
////		System.out.println(hmap);
////
//
//		for (int i : arr1) {
//			if (hmap.containsKey(i)) {
//				hmap.put(i, hmap.get(i) - 1);
//			}
//
//		}
//		for (int i : hmap.keySet()) {
//			if (hmap.get(i) == 0) {
//				System.out.println(i);
//			}
//
//		}
//	}
//
//	private static void intersection(int[] arr, int[] arr1) {
//
//		HashMap<Integer, Integer> hmap = new HashMap<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (!hmap.containsKey(arr[i])) {
//				hmap.put(arr[i], 1);
//			} else {
//				hmap.put(arr[i], hmap.get(arr[i]) + 1);
//
//			}
//		}
//		System.out.println(hmap);
////		for(int i=0;i<arr1.length;i++) {
////			if(hmap.containsKey(arr1[i])) {
////				System.out.print(arr1[i]+" ");
////				hmap.remove(arr1[i]);
////			}
////
////		}
////		System.out.println();
////		System.out.println(hmap);
////
//
//		for (int i : arr1) {
//			if (hmap.containsKey(i)) {
//				System.out.println(i);
//				hmap.put(i, hmap.get(i) - 1);
//
//				if (hmap.get(i) <= 0) {
//					hmap.remove(i);
//				}
//			}
//
//		}
//
//	}
//
//}
