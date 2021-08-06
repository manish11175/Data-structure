package binarysearchtree;

public class Client {

	public static void main(String[] args) {
		
		
		BinarySearchTree bst=new BinarySearchTree();
		int arr[]= {4,1,9,4,6,24,27,30};
		bst.addViaArray(arr);
		bst.display();
		//bst.postOrder();
//		System.out.println(bst.diameter());
//        System.out.println(bst.getSum(bst.root));
//		bst.remove(23);
//		bst.inOrder();
//		System.out.println("Diamter is "+bst.diameterBST());
		bst.inOrder();
		System.out.println();
//		bst.replaceWithSumLargerToIt();
//		bst.inOrder();
//		bst.remove(30);
//		bst.inOrder();
//		System.out.println(bst.find(4));
//		bst.targetPairSum(10);
		
//		System.out.println(bst.LCA(6, 30));
		
	}

	
	
}
