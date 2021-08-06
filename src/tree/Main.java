package tree;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Tree tree =new Tree();
//     tree.root=new Node(1);
//     tree.root.left=new Node(2);
//     tree.root.right=new Node(3);
//     tree.root.right.right=new Node(4);
//     tree.root.right.right.right=new Node(5);
//     tree.root.right.right.right.right=new Node(6);

//     tree.preOrder(tree.root);
//     System.out.println("inOrder");
//     tree.inOrder(tree.root);
//     System.out.println("PostOrder");
//     tree.PostOrder(tree.root);
		// tree.levelOrderTraverse(tree.root);
		Node root = new Node(50);
		Tree.add(new Node(25), 50, root, 'L');
		Tree.add(new Node(75), 50, root, 'R');
		Tree.add(new Node(90), 75, root, 'R');
		Tree.add(new Node(12), 25, root, 'L');
		Tree.add(new Node(37), 25, root, 'R');
		Tree.add(new Node(30), 37, root, 'L');
		Tree.add(new Node(40), 37, root, 'R');
		
//		Tree.add(new Node(15), 30, root, 'L');
//		Tree.add(new Node(31), 15, root, 'L');
//		Tree.add(new Node(40), 37, root, 'R');
//		Tree.add(new Node(62), 75, root, 'L');
//		Tree.add(new Node(87), 75, root, 'R');
//		Tree.add(new Node(60), 62, root, 'L');
//		Tree.add(new Node(70), 62, root, 'R');
//		Tree.add(new Node(90), 87, root, 'R');
//		Tree.add(new Node(990), 90, root, 'L');
//		Tree.add(new Node(991), 90, root, 'R');
//		Tree.add(new Node(40), 991, root, 'R');
//		Tree.add(new Node(122), 12, root, 'R');

		// Tree.display(root);
//	System.out.println(Tree.min(root));
//	System.out.println(Tree.size(root));
//	Tree.removeLeaf(null,root);
//	Tree.levelOrderTraverse(root);
//	System.out.println("nhdsjkfaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//	Tree.removeLeaf(null,root);
//Tree.levelOrderTraverse(root);
//	Tree.singleChild(root);
//		Tree.printPath(root, 100, 300, 0, " ");
	
//		System.out.println(Tree.NodeToRoot(root, 62));;
//	
//	Tree.display(root);
//	System.out.println(Tree.commonParent(root, 12, 75));
//		
//		System.out.println(Tree.isBalancedImprove(root));
////		System.out.println(Tree.isBalanced(root));
//		System.out.println(Tree.isBalanced1(root));
//		System.out.println(Tree.isBalancedImproved(root));
//	Tree.preOrderIteratively(root);
//	System.out.println();
//		Tree.preIter(root);
//	Tree.display(root);
//	Tree.postOrderIteratively(root);
//	System.out.println();
//	Tree.postIter(root);
//	System.out.println();
//	Tree.PostOrder(root);
//	
	
//	Tree.inOrder(root);
//	System.out.println();
//	Tree.inOrdIter(root);
//	
//		Tree.display(root);
//		Tree.deepLevelSum(root, 0);
//		System.out.println(Tree.sum);
		System.out.println(Tree.isBst(root));
		System.out.println(Tree.isBST(root));
		
	}

}
