package binarysearchtree;

import java.util.*;

//import com.sun.tools.javac.util.Pair;
public class BinarySearchTree {

	Node root;

	public void addViaArray(int arr[]) {

		for (int a : arr) {
			this.root = addUtil(this.root, a);
		}
	}

	public void add(int val) {
		addUtil(this.root, val);
	}

	private Node addUtil(Node root, int val) {

		if (root == null) {
			root = new Node(val);
			return root;
		}
		if (val < root.data) {

			root.left = addUtil(root.left, val);

		} else if (val > root.data) {
			root.right = addUtil(root.right, val);
		}
		return root;
	}

	public void display() {
		display(this.root);
	}

	public void display(Node root) {
		if (root == null) {
			return;
		}
		String str = "";
		str += root.left != null ? root.left.data + "->" : ".->";
		str += root.right != null ? root.data + "<-" + root.right.data : root.data + "<-.";
		System.out.println(str);
		display(root.left);
		display(root.right);
	}

	public void preOrder() {
		preOrder(this.root);
	}

	private void preOrder(Node root) {

		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder() {
		inOrder(this.root);
	}

	private void inOrder(Node root) {

		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public void postOrder() {
		postOrder(this.root);
	}

	private void postOrder(Node root) {

		if (root == null) {
			return;
		}
		postOrder(root.left);

		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public int height() {
		return height(this.root);
	}

	private int height(Node root) {

		if (root == null) {
			return 1;
		}
		int left = height(root.left);
		int right = height(root.right);

		return Math.max(left, right) + 1;
	}

//    public int diameterLength() {
//        Pair<Integer, Integer> pair = diameterLength(this.root);
//        return pair.snd;
//    }
//
//    private Pair<Integer, Integer> diameterLength(Node root) {
//
//        if(root == null)
//            return new Pair<>(0, 0);
//
//        Pair<Integer, Integer> leftDia = diameterLength(root.left);
//        Pair<Integer, Integer> rightDia = diameterLength(root.right);
//
//        int maxHeight = Math.max(leftDia.fst, rightDia.fst) + 1;
//        int maxDia = Math.max(Math.max(leftDia.snd, rightDia.snd), leftDia.fst + rightDia.fst + 1);
//        return new Pair<>(maxHeight, maxDia);
//    }
	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node.left == null) {
			return node.data;
		}
		return min(node.left);
	}

	public void printInRange(int lo, int hi) {
		pairInRange(root, lo, hi);
	}

	private void pairInRange(Node root, int lo, int hi) {
		if (root == null) {
			return;
		}
		pairInRange(root.left, lo, hi);
		if (root.data >= lo && root.data <= hi) {
			System.out.print(root.data + " ");
		}
		pairInRange(root.right, lo, hi);
	}

	public void printInRange1(int lo, int hi) {
		printInRange1(root, lo, hi);
	}

	private void printInRange1(Node root, int lo, int hi) {
		if (root == null) {
			return;
		}
		if (root.data > hi) {
			printInRange1(root.left, lo, hi);
		}

		else if (root.data >= lo && root.data <= hi) {
			printInRange1(root.left, lo, hi);
			System.out.print(root.data + " ");
			printInRange1(root.right, lo, hi);
		} else {
			printInRange1(root.right, lo, hi);
		}
	}
	
	public boolean find(int i) {
		
		return find(root,i);
	}
	private boolean find(Node root,int data) {
		
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}
		if(root.data>data) {
			boolean left=find(root.left,data);
			return left==true?true:false;
		}
		if(root.data<data) {
			boolean right=find(root.right,data);
			return right==true?true:false;
		}
		
		return false;
	}
	
//	private int sum;
//	public void replaceWithSum()
//	{
//		replaceWithSum(root);
//	}
//
//	private void  replaceWithSum(Node root) {
//	
//		if(root==null) {
//			return;
//		}
//		replaceWithSum( root.right);
//		root.data=sum;
//		replaceWithSum( root.left);
//		
//	}
//
//	
//	

	public void remove(int data) {
		root = remove(root, data);
	}

	private Node remove(Node root, int data) {

		if (root == null) {
			return root;
		}
		if (root.data > data) {
			root.left = remove(root.left, data);
		} else if (root.data < data) {
			root.right = remove(root.right, data);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				int lmax = max(root.left);
				root.data = lmax;
				root.left = remove(root.left, lmax);
			}
		}
		return root;
	}

	public int lowerCommonAncentor(int n1, int n2) {
		return lowerCommonAncentor(root, n1, n2);
	}

	private int lowerCommonAncentor(Node root, int n1, int n2) {

		if (n1 > root.data && n2 > root.data) {
			return lowerCommonAncentor(root.right, n1, n2);
		} else if (n1 < root.data && n2 < root.data) {
			return lowerCommonAncentor(root.left, n1, n2);
		} else {
			return root.data;
		}
	}

	public void targetSumPair(int sum) {
		targetSumPair(root, sum);
	}

	private void targetSumPair(Node node, int sum) {
		if (node == null) {
			return;
		}
		if (find(sum - node.data)) {
			if (node.data < sum - node.data) {
				System.out.println(node.data + " " + (sum - node.data));
			}
		}
		targetSumPair(node.left, sum);
		targetSumPair(node.right, sum);

		// TODO Auto-generated method stub

	}

	
//	public int diameterOfBinaryTree(TreeNode root) {
//	       
//	       // base case if tree is empty
//	        if (root == null)
//	            return 0;
//	 
//	      
//	        int lheight = height(root.left);
//	        int rheight = height(root.right);
//	 
//	        int ldiameter = diameterOfBinaryTree(root.left);
//	        int rdiameter = diameterOfBinaryTree(root.right);
//	 

//	        return Math.max(lheight + rheight, Math.max(ldiameter, rdiameter));
//	    }
//	     
//	        
//	   public static int height(TreeNode node)
//	    {
//	        // base case tree is empty
//	        if (node == null)
//	            return 0;
//	 
//
//	        return ( Math.max(height(node.left),height(node.right))+1);
//	    }

	static class Pair {
		int first;
		int second;

		Pair(int f, int s) {
			this.first = f;
			this.second = s;
		}

	}

	public int diameterBST() {
		return diameterBST(root).second;
	}

	private Pair diameterBST(Node node) {

		if (node == null) {
			return new Pair(0, 0);
		}

		Pair left = diameterBST(node.left);
		Pair right = diameterBST(node.right);

		int height = Math.max(left.first, right.second) + 1;
		int diaMeter = Math.max(left.first + right.first + 1, Math.max(left.second, right.second));
		return new Pair(height, diaMeter);

	}

	private int sum;

	public void replaceWithSumLargerToIt() {
		sum = 0;
		replaceWithSumLargerToIt(root);
	}

	private void replaceWithSumLargerToIt(Node node) {
		if (node == null) {
			return;
		}
		replaceWithSumLargerToIt(node.right);
		int temp = node.data;
		node.data = sum;
		sum += temp;
		replaceWithSumLargerToIt(node.left);
	}

	public void removeNode(int val) {
		removeNode(root, val);
	}

	private Node removeNode(Node node, int val) {

		if (node.data > val) {
			node.left = removeNode(node.left, val);
		} else if (node.data < val) {
			node.right = removeNode(node.right, val);
		} else {
			if (node.left == null && node.right == null) {
				return null;
			} else if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			} else {
				int lmax = max(node.left);
				node.data = lmax;
				node.left = removeNode(node.left, lmax);

			}

		}
		return node;

	}

	public void targetPairSum(int target) {
		targetPairSum(root, target);

	}

	private void targetPairSum(Node node, int sum) {

		if(node==null) {
			return;
		}
		int temp = sum - node.data;
		if (find(temp)) {
			if (node.data < temp) {
				System.out.println(node.data + " " + temp);
			}
		}
		targetPairSum(node.left,sum);
		targetPairSum(node.right,sum);

	}

	public int LCA(int n1,int n2) {
		return LCA(root,n1,n2);
	}
	private int LCA(Node node,int n1,int n2) {
		
		if(n1>node.data && n2>node.data) {
			return LCA(node.right,n1,n2);
		}
		else if(n1<node.data && n2<node.data) {
			return LCA(node.left,n1,n2);
		}
		else {
			return node.data;
		}
	}
	
	
}
