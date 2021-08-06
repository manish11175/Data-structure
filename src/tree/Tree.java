package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

	Node root;

	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		// start from root
		System.out.print(root.data + " ");
		// then go the left till left is end
		preOrder(root.left);
		// then call right node
		preOrder(root.right);
	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		/// start from left node of tree till left -end and then print when it is return
		inOrder(root.left);
		// the go the root node
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void PostOrder(Node root) {
		if (root == null) {
			return;
		}

		PostOrder(root.left);

		PostOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static int height(Node root) {
		if (root == null) {
			return 0;
		}
		int left = height(root.left);
		int right = height(root.right);
		return Math.max(left, right) + 1;
	}

	public static int left(Node root, int number) {
		if (root == null || root.left == null) {
			return -1;
		}
		if (root.data == number) {
			return root.left.data;
		}
		int fromleft = left(root.left, number);
		int fromright = left(root.right, number);

		return fromleft != -1 ? fromleft : fromright;
	}

	public static void levelTraverse(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node curr = queue.poll();
			System.out.print(curr.data + " ");
			if (curr.left != null) {
				queue.add(curr.left);
			}
			if (curr.right != null) {
				queue.add(curr.right);
			}
		}

	}

	public static void levelOrderTraverse(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node curr = queue.poll();
			if (curr == null) {
				System.out.println();

				if (queue.size() != 0) {
					queue.add(null);
				}
				continue;

			}

			System.out.print(curr.data + " ");
			if (curr.left != null) {
				queue.add(curr.left);
			}
			if (curr.right != null) {
				queue.add(curr.right);
			}
		}

	}

	public static Node find(Node root, int number) {
		if (root == null) {
			return null;
		}
		if (root.data == number) {
			return root;
		}
		Node left = find(root.left, number);
		Node right = find(root.right, number);
		return left != null ? left : right;
	}

	public static void add(Node node, int where, Node root, char position) {
		if (root == null) {
			root = node;
			return;
		}
		Node temp = find(root, where);
		if (position == 'L' && temp.left == null) {

			temp.left = node;
			return;
		} else if (position == 'R' && temp.right == null) {
			temp.right = node;
			return;
		}
		throw new RuntimeException("Already node is present");
	}

	public static void display(Node root) {
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

	public static int max(Node root) {

		if (root == null) {
			return 0;
		}

		int left = max(root.left);
		int right = max(root.right);
		int mlr = Math.max(left, right);
		return Math.max(root.data, mlr);
	}

	public static int min(Node root) {

		if (root == null) {
			return Integer.MAX_VALUE;
		}

		int left = min(root.left);
		int right = min(root.right);
		int mlr = Math.min(left, right);
		return Math.min(root.data, mlr);
	}

	public static int size(Node root) {
		if (root == null) {
			return 0;
		}
		int left = size(root.left);
		int right = size(root.right);
		return left + right + 1;
	}

	public static void removeLeaf(Node root, Node child) {
		if (child == null) {
			return;
		}

		if (child.left == null && child.right == null) {
			if (root.left == child) {
				root.left = null;

			} else {
				root.right = null;
			}
			return;
		}

		removeLeaf(child, child.left);
		removeLeaf(child, child.right);
	}

//	public static void removeLeaf(Node root) {
//		// TODO Auto-generated method stub
//		if(root==null)
//		{
//			return;
//			
//		}
//		if((root.left.left==null) && (root.left.right==null) && (root.right.left==null) && root.right.right==null)
//		{
//			root.left=null;
//			root.right=null;
//			return;
//		}
//		else if((root.left.left==null) && (root.left.right==null))
//		{
//			root.left=null;
//			return;
//		}
//		else if(root.right.left==null && root.right.right==null)
//		{
//			root.right=null;
//			return;
//		}
//		removeLeaf(root.left);
//		removeLeaf(root.right);
//	}

	public static void singleChild(Node parent) {
		if (parent == null) {
			return;
		}
		if ((parent.left == null && parent.right != null) || (parent.left != null && parent.right == null)) {
			if (parent.left != null) {
				System.out.println(parent.left.data);
			} else {
				System.out.println(parent.right.data);
			}

		}
		singleChild(parent.left);
		singleChild(parent.right);

	}

	public static void printPath(Node root, int low, int high, int sum, String str) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			sum += root.data;
			str += root.data;
			if (sum <= high && sum >= low) {

				System.out.println(str);

			}
			return;
		}

		printPath(root.left, low, high, sum + root.data, str + root.data + " ");
		printPath(root.right, low, high, sum + root.data, str + root.data + " ");

	}

	public static ArrayList<Node> nodeToRoot(Node root, int val) {
		if (root == null) {
			ArrayList<Node> br = new ArrayList<Node>();
			return br;

		}
		if (root.data == val) {

			ArrayList<Node> br = new ArrayList<Node>();
			br.add(root);
			return br;
		}

		ArrayList<Node> res = nodeToRoot(root.left, val);
		if (res.size() > 0) {
			res.add(root);
			return res;
		}
		ArrayList<Node> res1 = nodeToRoot(root.right, val);
		if (res1.size() > 0) {
			res1.add(root);
			return res1;
		}
		return new ArrayList<Node>();
	}

	public static ArrayList<Node> NodeToRoot(Node root, int val) {
		if (root == null) {
			ArrayList<Node> br = new ArrayList<>();
			return br;
		}
		if (root.data == val) {
			ArrayList<Node> br = new ArrayList<>();
			br.add(root);
			return br;
		}
		ArrayList<Node> res = NodeToRoot(root.left, val);
		if (res.size() > 0) {
			res.add(root);
			return res;
		}
		ArrayList<Node> res1 = NodeToRoot(root.right, val);
		if (res1.size() > 0) {
			res1.add(root);
			return res1;
		}
		return new ArrayList<Node>();
	}

	static int max_level = -1;

	public static void leftView(Node root, int level) {
		if (root == null) {
			return;
		}
		if (max_level < level) {
			System.out.println(root.data);
			max_level = level;
		}
		leftView(root.left, level + 1);
		leftView(root.right, level + 1);
	}

	public static void rightView(Node root, int level) {
		if (root == null) {
			return;
		}
		if (max_level < level) {
			System.out.println(root.data);
			max_level = level;
		}
		rightView(root.right, level + 1);
		rightView(root.left, level + 1);

	}

	public static void rightViewQ(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int n = queue.size();
			while (n != 0) {
				Node temp = queue.poll();
				if (n == 1) {
					System.out.println(temp.data);
				}
				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}

				n--;
			}
		}
	}

	public static void leftViewQ(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int n = queue.size();
			while (n != 0) {
				Node temp = queue.poll();
				if (n == 1) {
					System.out.println(temp.data);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
				if (temp.left != null) {
					queue.add(temp.left);
				}
				n--;
			}
		}
	}

	// lower common Ancentor
	public static int commonParent(Node root, int n1, int n2) {
		ArrayList<Node> arr1 = NodeToRoot(root, n1);
		ArrayList<Node> arr2 = NodeToRoot(root, n2);

		int i = arr1.size() - 1;
		int j = arr2.size() - 1;
		while (arr1.get(i) == arr2.get(j)) {
			if (arr1.get(i).data == n2 || arr2.get(j).data == n1) {
				return arr1.get(i + 1).data;

			}
			i--;
			j--;
		}
		return arr1.get(i + 1).data;
	}

	static class Pair {
		Node node;
		int wc;

		public Pair(Node node, int wc) {
			this.node = node;
			this.wc = wc;
		}
	}

	public static void preOrderIteratively(Node root) {
		Stack<Pair> stack = new Stack<>();
		Pair pair = new Pair(root, 0);
		stack.push(pair);
		while (stack.size() > 0) {
			Pair tpair = stack.peek();

			if (tpair.wc == 0) {
				System.out.print(tpair.node.data);
				System.out.print(" ");
				tpair.wc++;
			}

			else if (tpair.wc == 1) {
				if (tpair.node.left != null) {
					Pair left = new Pair(tpair.node.left, 0);
					stack.push(left);
				}
				tpair.wc++;
			} else if (tpair.wc == 2) {
				if (tpair.node.right != null) {
					Pair right = new Pair(tpair.node.right, 0);
					stack.push(right);
				}
				tpair.wc++;
			} else {
				stack.pop();
			}
		}

	}

	public static void postOrderIteratively(Node root) {
		Stack<Pair> stack = new Stack<>();
		Pair pair = new Pair(root, 0);
		stack.push(pair);
		while (stack.size() > 0) {
			Pair tpair = stack.peek();

			if (tpair.wc == 0) {
				if (tpair.node.left != null) {
					Pair left = new Pair(tpair.node.left, 0);
					stack.push(left);
				}
				tpair.wc++;
			}

			else if (tpair.wc == 1) {

				if (tpair.node.right != null) {
					Pair right = new Pair(tpair.node.right, 0);
					stack.push(right);
				}
				tpair.wc++;
			} else if (tpair.wc == 2) {

				System.out.print(tpair.node.data);
				System.out.print(" ");
				tpair.wc++;
			} else {
				stack.pop();
			}
		}

	}

	public static boolean isBalanced(Node root) {
		if (root == null) {
			return true;
		}
		boolean leftCheck = isBalanced(root.left);
		if (leftCheck == false) {
			return false;
		}
		boolean rightCheck = isBalanced(root.right);
		if (rightCheck == false) {
			return false;
		}
		int lheight = height(root.left);
		int rheight = height(root.right);
		if (lheight - rheight >= -1 && lheight - rheight <= 1) {
			return true;
		}
		return false;
	}

	static class Pair1 {
		boolean balance;
		int height;

		Pair1(int h, boolean bal) {
			this.balance = bal;
			this.height = h;
		}
	}

	public static boolean isBalancedImprove(Node node) {
		return isBalancedImproveHelper(node).balance;
	}

	private static Pair1 isBalancedImproveHelper(Node node) {

		if (node == null) {
			return new Pair1(0, true);
		}
		Pair1 leftp = isBalancedImproveHelper(node.left);
		Pair1 rightp = isBalancedImproveHelper(node.right);
		if (leftp.balance == false || rightp.balance == false) {
			return new Pair1((Math.max(leftp.height, rightp.height) + 1), false);
		}
		if ((leftp.height - rightp.height) >= -1 && (leftp.height - rightp.height) <= 1) {
			return new Pair1((Math.max(leftp.height, rightp.height) + 1), true);
		}
		return new Pair1((Math.max(leftp.height, rightp.height) + 1), false);

	}

	public static boolean isBalanced1(Node root) {
		if (root == null) {
			return true;
		}

		boolean left = isBalanced1(root.left);
		if (left == false) {
			return false;
		}
		boolean right = isBalanced1(root.right);
		if (right == false) {
			return false;
		}

		int lheight = height(root.left);
		int rheight = height(root.right);

		if ((lheight - rheight) >= -1 && (lheight - rheight) <= 1) {
			return true;
		}
		return false;
	}

	static class Height {

		int height;
		boolean balance;

		Height(int h, boolean bal) {
			this.height = h;
			this.balance = bal;

		}
	}

	public static boolean isBalancedImproved(Node root) {

		return isBalacedHelpers(root).balance;
	}

	private static Height isBalacedHelpers(Node root2) {

		if (root2 == null) {
			return new Height(0, true);
		}
		Height left = isBalacedHelpers(root2.left);
		Height right = isBalacedHelpers(root2.right);

		if (left.balance == false || right.balance == false) {
			return new Height(Math.max(left.height, right.height) + 1, false);
		}
		if (left.height - right.height >= -1 && left.height - right.height <= 1) {
			return new Height(Math.max(left.height, right.height) + 1, true);
		}
		return new Height(Math.max(left.height, right.height) + 1, false);
	}

	static class PairA {
		int wc;
		Node node;

		PairA(Node node, int wc) {
			this.node = node;
			this.wc = wc;
		}
	}

	public static void preIter(Node node) {
		Stack<PairA> stack = new Stack<>();
		stack.push(new PairA(node, 0));
		while (stack.size() > 0) {
			PairA tpair = stack.peek();
			if (tpair.wc == 0) {
				System.out.print(tpair.node.data);
				System.out.print(" ");
				tpair.wc++;
			} else if (tpair.wc == 1) {
				if (tpair.node.left != null) {
					stack.push(new PairA(tpair.node.left, 0));
				}
				tpair.wc++;
			} else if (tpair.wc == 2) {
				if (tpair.node.right != null) {
					stack.push(new PairA(tpair.node.right, 0));
				}
				tpair.wc++;
			} else {
				stack.pop();
			}
		}

	}

	public static void postIter(Node node) {
		Stack<PairA> stack = new Stack<>();
		stack.push(new PairA(node, 0));
		while (stack.size() > 0) {
			PairA tpair = stack.peek();
			if (tpair.wc == 0) {
				if (tpair.node.left != null) {
					stack.push(new PairA(tpair.node.left, 0));
				}
				tpair.wc++;
			} else if (tpair.wc == 1) {
				if (tpair.node.right != null) {
					stack.push(new PairA(tpair.node.right, 0));
				}
				tpair.wc++;
			} else if (tpair.wc == 2) {
				System.out.print(tpair.node.data);
				System.out.print(" ");
				tpair.wc++;
			} else {
				stack.pop();
			}
		}

	}

	public static void inOrdIter(Node root) {
		Stack<PairA> stack = new Stack<>();
		stack.push(new PairA(root, 0));
		while (stack.size() > 0) {
			PairA tpair = stack.peek();
			if (tpair.wc == 0) {
				if (tpair.node.left != null) {
					stack.push(new PairA(tpair.node.left, 0));
				}
				tpair.wc++;
			} else if (tpair.wc == 1) {
				System.out.print(tpair.node.data);
				System.out.print(" ");
				tpair.wc++;
			} else if (tpair.wc == 2) {
				if (tpair.node.right != null) {
					stack.push(new PairA(tpair.node.right, 0));
				}
				tpair.wc++;
			} else {
				stack.pop();
			}

		}
	}

	static class Pair2 {
		int height;
		int maxHeight;

		Pair2(int h, int m) {
			this.height = h;
			this.maxHeight = m;
		}

	}

	public static int diameter(Node node) {
		return diameterHelper(node).maxHeight;
	}

	private static Pair2 diameterHelper(Node node) {
		if (node == null) {
			return new Pair2(0, 0);
		}
		Pair2 leftP = diameterHelper(node.left);
		Pair2 rightP = diameterHelper(node.right);
		int myDia = leftP.height + rightP.height + 1;
		int max = Math.max(myDia, Math.max(leftP.maxHeight, rightP.maxHeight));
		return new Pair2(Math.max(leftP.height, rightP.height) + 1, max);
	}

	static int sum = 0;

	public static void deepLevelSum(Node root, int level) {
		if (root == null) {
			return;
		}
		if (max_level == level) {
			sum += root.data;
		}
		if (max_level < level) {

			sum = root.data;
			max_level = level;
		}
		deepLevelSum(root.left, level + 1);
		deepLevelSum(root.right, level + 1);
	}

	public static void convertToLinkedList(Node root) {

		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			return;
		}
		if (root.left != null) {
			convertToLinkedList(root.left);
			Node temp = root.right;
			root.right = root.left;
			root.left = null;
			Node curr = root.right;
			while (curr.right != null) {

				curr = curr.right;
			}
			curr.right = temp;
		}
		convertToLinkedList(root.right);
	}

	public static boolean isSubTree(Node tree, Node sub) {
		if (tree == null) {
			return false;
		}
		if (sub == null) {

			return false;
		}
		if (isEqual(tree, sub)) {
			return true;
		}
		return isSubTree(tree.left, sub) && isSubTree(tree.right, sub);

	}

	private static boolean isEqual(Node t1, Node t2) {
		// TODO Auto-generated method stub

		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}
		if (t1.data == t2.data) {
			return isEqual(t1.left, t2.left) && isEqual(t1.right, t2.right);
		}

		return false;
	}

	private static class pair4 {
		int max;
		int min;
		boolean Isbalanced;
	}

	public static boolean isBst(Node node) {
		return isBstHelper(node).Isbalanced;
	}

	private static pair4 isBstHelper(Node node) {
		if (node == null) {
			pair4 p = new pair4();
			p.Isbalanced = true;
			p.max = Integer.MIN_VALUE;
			p.min = Integer.MAX_VALUE;
			return p;
		}

		pair4 lpair = isBstHelper(node.left);
		pair4 rpair = isBstHelper(node.right);

		if (lpair.Isbalanced == false || rpair.Isbalanced == false) {
			pair4 p = new pair4();
			p.Isbalanced = false;
			return p;
		}

		pair4 mpair = new pair4();
		mpair.max = Math.max(lpair.max, Math.max(rpair.max, node.data));
		mpair.min = Math.min(lpair.min, Math.min(rpair.min, node.data));
		if (node.data > lpair.max && node.data < rpair.min) {
			mpair.Isbalanced = true;
		}

		return mpair;
	}

	static class Pair5 {
		int min, max;
		boolean isBalanced;

	}

	public static boolean isBST(Node node) {
		return isBstHelper1(node).isBalanced;
	}

	private static Pair5 isBstHelper1(Node node) {
		if (node == null) {
			Pair5 p = new Pair5();
			p.isBalanced = true;
			p.min = Integer.MIN_VALUE;
			p.max = Integer.MAX_VALUE;

			return p;
		}

		Pair5 pairL = isBstHelper1(node.left);
		Pair5 pairR = isBstHelper1(node.right);
		if (pairL.isBalanced == false || pairR.isBalanced == false) {
			Pair5 p = new Pair5();
			p.isBalanced = false;
			return p;
		}

		Pair5 mpair = new Pair5();

		mpair.max = Math.max(pairL.max, Math.max(pairR.max, node.data));
		mpair.min = Math.min(pairL.min, Math.min(pairR.min, node.data));

		if (node.data > pairL.max && node.data < pairR.min) {

			mpair.isBalanced = true;

		}

		return mpair;

	}

}
