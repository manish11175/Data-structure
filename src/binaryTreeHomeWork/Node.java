package binaryTreeHomeWork;

public class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;

	}

	@Override
	public String toString() {

		return this.data + " ";
	}
}
