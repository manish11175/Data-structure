package genericTree;

import java.util.*;

import tree.Node;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	 private Node root;
	int size;
	private Object Node;

	GenericTree(int arr[]) {
		Stack<Node> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				stack.pop();
			} else {
				Node node = new Node();
				node.data = arr[i];
				this.size++;
				if (stack.size() > 0) {
					stack.peek().children.add(node);
				} else {

					root = node;
				}
				stack.push(node);
			}
		}
	}

	void display() {
		display(root);
	}

	private void display(Node root) {

		String s = root.data + "->";
		for (Node child : root.children) {
			s += child.data + ", ";

		}
		s += ".";
		System.out.println(s);
		for (Node child : root.children) {
			display(child);
		}

	}

	public int size() {
		if (root == null) {
			return 0;
		}
		return size(root);
	}

	private int size(Node root) {
		int size = 0;
		for (Node child : root.children) {
			int csize = size(child);
			size += csize;
		}
		size++;
		return size;
	}

	public int max() {
		if (root == null) {
			return 0;
		}
		return max(root);
	}

	private int max(Node root) {
		int max = root.data;
		for (Node child : root.children) {
			int cmax = max(child);
			max = Math.max(max, cmax);

		}
		return max;
	}

	public int height() {
		if (root == null) {
			return 0;
		}
		return height(root);
	}

	private int height(Node root) {
		int height = 0;
		for (Node child : root.children) {
			int cheight = height(child);
			height = Math.max(height, cheight);

		}
		height++;
		return height;
	}

	public boolean find(int data) {
		return find(root, data);
	}

	private boolean find(Node node, int val) {
		if (node.data == val) {
			return true;
		}

		for (Node child : node.children) {
			boolean childres = find(child, val);
			if (childres == true) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Integer> nodeToRootPath(int val) {
		return nodeToRootPath(root, val);

	}

	private ArrayList<Integer> nodeToRootPath(Node root, int val) {

		if (root.data == val) {
			ArrayList<Integer> br = new ArrayList<>();
			br.add(root.data);
			return br;
		}
		ArrayList<Integer> mres = new ArrayList<>();

		for (Node child : root.children) {

			ArrayList<Integer> childres = nodeToRootPath(child, val);
			if (childres.size() > 0) {
				mres = childres;
				mres.add(root.data);
				return mres;
			}
		}
		return new ArrayList<>();
	}

	public void removeLeaf() {

		if (root == null) {
			return;
		}
		removeLeaf(root);
	}

	private void removeLeaf(Node root) {
		for (int i = root.children.size() - 1; i >= 0; i--) {

			Node child = root.children.get(i);
			if (child.children.size() > 0) {
				removeLeaf(child);

			} else {

				root.children.remove(child);
			}
		}

	}
	public void mirror()
	{
		mirror(root);
	}
	private void mirror(Node root) {
		
		
		for(Node child:root.children) {
			mirror(child);
		}
		Collections.reverse(root.children);
	}
	public void mirror1()
	{
		mirror1(root);
	}
	private void mirror1(Node root) {
		
		
		for(Node child:root.children) {
			mirror1(child);
		}
		int l=0;
		int r=root.children.size()-1;
		while(l<r) {
			Node leftNode=root.children.get(l);
			Node rightNode=root.children.get(r);
			root.children.set(r,leftNode);
			root.children.set(l, rightNode);
			l++;
			r--;
		}
		
	}
	
	public void linear() {
		
		linear(root);
	}
	private void linear(Node root) {
		
		for(Node child:root.children) {
			linear(child);
		}
		for(int i=root.children.size()-1;i>0;i--) {
			Node last=root.children.remove(i);
			Node slast=root.children.get(i-1);
			 Node sltail=getTail(slast);
			 sltail.children.add(last);
		}
	}

	private Node getTail(Node node) {
		// TODO Auto-generated method stub
		Node tail=node;
		while(tail.children.size()!=0) {
			tail=tail.children.get(0);
			
		}
		return tail;
	}
	
	public  void linearlise() {
		
		linearlise(root);
		
	}
	private static Node linearlise(Node node) {
		if(node.children.size()==0) {
			return node;
		}
		Node ltail=linearlise(node.children.get(node.children.size()-1));
		while( node.children.size()>1) {
			Node last=node.children.remove(node.children.size()-1);
			Node slast=node.children.get(node.children.size()-1);
			Node sltail=linearlise(slast);
			sltail.children.add(last);
		   }
		return ltail;
		
	}
	
	public static boolean isSimilar(GenericTree t1,GenericTree t2) {
		
		return isSimilar(t1.root,t2.root);
		
		
		
	}
	private static boolean isSimilar(Node node1,Node node2) {
		if(node1.children.size()!=node2.children.size()) {
			return false;
		}
		for(int i=0;i<node1.children.size();i++) {
			Node child1=node1.children.get(i);
			Node child2=node2.children.get(i);
			
			boolean areSimilar=isSimilar(child1,child2);
			if(areSimilar==false) {
				return false;
			}
					
		}
		return true;
	}
	

	public int  getDiffOddEvenLevel() {
		
		Queue<Node>queue=new LinkedList<>();
		queue.add(root);
		int odd=0;
		int even=0;
		
		boolean level=true;
		while(!queue.isEmpty()) {
			int size=queue.size();
			while(size-->0) {
				Node temp=queue.poll();
				if(level) {
					odd+=temp.data;
					}
				else {
					even+=temp.data;
				}
				queue.addAll(temp.children);
				}
			level=!level;
		}
		return Math.abs(odd-even);
	}
	
	public boolean isSymmetric(GenericTree t2 )
	{
		return isSymmetricUtil(root,t2.root);
	}
	public boolean isSymmetricUtil(Node node1,Node node2) {
		
		if(node1==null && node2==null) {
			return true;
		}
		if(node2==null||node1==null) {
			return false;
		}
		if(node1.children.size()!=node2.children.size()) {
			return false;
		}
		int i=0;
		int j=node2.children.size()-1;
		
		if(node1.data==node2.data)
		{
			while(i<node1.children.size() && j>=0 ) {
				

				  if(!isSymmetricUtil(node1.children.get(i),node2.children.get(j))) {
					  break;
				  }
				  i++;
				  j--;
				
			}		  
		}

		if(i<=node1.children.size() ||  j>=0) {
			return false;
		}
		return true;  
	}
	
	
	 public boolean isMirror(GenericTree t2) {
	        return isMirrorUtil(root, t2.root);
	    }


	    //           1                                    1
	    //    2   3   4   5                           5  4   8   2(j)



	    public boolean isMirrorUtil(Node node1, Node node2) {

	        if(node1 == null && node2== null)
	            return true;

	        if(node2 == null || node1 == null)
	            return false;

	        if(node1.children.size() != node2.children.size())
	            return false;

	        int i = 0;
	        int j = node2.children.size()-1;
	        if(node1.data == node2.data) {
	            while (i < node1.children.size() && j>=0) {
	                if(!isMirrorUtil(node1.children.get(i), node2.children.get(j))) {
	                    break;
	                }
	                i++;
	                j--;
	            }
	        }
	        if(i <= node1.children.size() || j>=0) {
	            return false;
	        }
	        return true;
	    }

}
 