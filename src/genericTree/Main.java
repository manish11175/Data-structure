package genericTree;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		int arr[] = { 1, 2, -1, 3, -1, 4, -1, -1 };
	

		int arr1[] = { 1, 4, -1, 3, -1, 2, -1, -1 };
		GenericTree tree = new GenericTree(arr);
		GenericTree tree1 = new GenericTree(arr1);
//    System.out.println( tree.nodeToRootPath(90));
//    . tree1.display();
//     System.out.println("_______________________");
//     
//     tree.linear();
//     tree.display(); 
//     System.out.println("______________________________");
//     tree.linearlise();
//     
		// System.out.println(GenericTree.isSimilar(tree, tree1));
//	tree.display();
//	tree1.display();
		System.out.println(tree.isMirror(tree1));
	}

}
