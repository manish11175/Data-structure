package binaryTreeHomeWork;

import java.util.Stack;

public class Tree {

	Node root;

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

		throw new RuntimeException("Node already exists at given position");
	}

	private static Node find(Node root, int where) {

		if (root == null) {
			return null;
		}
		if (root.data == where) {
			return root;
		}
		Node left = find(root.left, where);
		Node right = find(root.right, where);
		return left != null ? left : right;
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

	static class Pair {
		Node node;
		int wc;

		Pair(Node node, int wc) {
			this.node = node;
			this.wc = wc;
		}
	}

	public static void PostIter(Node root) {
		Stack<Pair> stack = new Stack<>();
		stack.push(new Pair(root, 0));
		while (stack.size() > 0) {

			Pair tpair = stack.peek();
			if (tpair.wc == 0) {
				if (tpair.node.left != null) {
					stack.push(new Pair(tpair.node.left, 0));
				}
				tpair.wc++;
			} else if (tpair.wc == 1) {
				if (tpair.node.right != null) {
					stack.push(new Pair(tpair.node.right, 0));
				}
				tpair.wc++;
			} else if (tpair.wc == 2) {
				System.out.print(tpair.node.data);
				tpair.wc++;
				System.out.print(" ");
			} else {
				stack.pop();
			}
		}

	}

	public static void PreIter(Node root) {
		Stack<Pair> stack = new Stack<>();
		stack.push(new Pair(root, 0));
		while (stack.size() > 0) {

			Pair tpair = stack.peek();
			if (tpair.wc == 0) {
				System.out.print(tpair.node.data);
				tpair.wc++;
				System.out.print(" ");
			}
			if (tpair.wc == 1) {
				if (tpair.node.left != null) {
					stack.push(new Pair(tpair.node.left, 0));
				}
				tpair.wc++;
			} else if (tpair.wc == 2) {
				if (tpair.node.right != null) {
					stack.push(new Pair(tpair.node.right, 0));
				}
				tpair.wc++;
			}

			else {
				stack.pop();
			}
		}

	}

	public static void InOrdIter(Node root) {
		Stack<Pair> stack = new Stack<>();
		stack.push(new Pair(root, 0));
		while (stack.size() > 0) {

			Pair tpair = stack.peek();

			if (tpair.wc == 0) {
				if (tpair.node.left != null) {
					stack.push(new Pair(tpair.node.left, 0));
				}
				tpair.wc++;
			} else if (tpair.wc == 1) {
				System.out.print(tpair.node.data);
				tpair.wc++;
				System.out.print(" ");
			} else if (tpair.wc == 2) {
				if (tpair.node.right != null) {
					stack.push(new Pair(tpair.node.right, 0));
				}
				tpair.wc++;
			}

			else {
				stack.pop();
			}
		}

	}

	public static void InOrdMorris(Node root) {
		if (root == null) {
			return;
		}
		Node pre;
		Node curr = root;
		while (curr != null) {
			if (curr.left == null) {
				System.out.print(curr.data + " ");
				curr = curr.right;
			} else {
				pre = curr.left;
				while (pre.right != null && pre.right != curr) {
					pre = pre.right;
				}
				if (pre.right == null) {
					pre.right = curr;
					curr = curr.left;
				} else {
					pre.right = null;
					System.out.print(curr.data + " ");
					curr = curr.right;
				}
			}
		}
	}

	public static void PreOrdMorris(Node root) {
		
		while(root!=null)
		{
			if(root.left==null) {
				System.out.print(root.data+" ");
				root=root.right;
			}
			else {
				Node curr=root.left;
				while (curr.right != null && curr.right != root) { 
                    curr = curr.right; 
                } 
  
                // If the right child of inorder predecessor  
                // already points to this node 
                if (curr.right == root) { 
                    curr.right = null; 
                    root = root.right; 
                } 
   
                // If right child doesn't point to this node, then print 
                // this node and make right child point to this node 
                else { 
                    System.out.print(root.data + " "); 
                    curr.right = root; 
                    root = root.left; 
                }
			}
		}
	}
}
