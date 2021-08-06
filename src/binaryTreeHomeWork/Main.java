package binaryTreeHomeWork;

public class Main {

	public static void main(String[] args) {
		
//		Tree tree=new Tree();
//		
		Node root=new Node(1);
        Tree.add(new Node(2), 1, root, 'L');
        Tree.add(new Node(3), 1, root, 'R');
        Tree.add(new Node(4), 2, root, 'L');
        Tree.add(new Node(5), 2, root, 'R');
        
       Tree.display(root);
       
       System.out.println();
       Tree.PreIter(root);
       System.out.println();
       Tree.InOrdIter(root);
       System.out.println();
       Tree.PostIter(root);
       System.out.println();
       Tree.InOrdMorris(root);
       System.out.println();
       Tree.PreOrdMorris(root);
	}

}
