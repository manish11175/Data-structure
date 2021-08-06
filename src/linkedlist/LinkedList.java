package linkedlist;

public class LinkedList {

	private Node head;
	private int size;
	private Node tail;

	private Node leftHelper;

	public boolean isPalindrome() {
		leftHelper = this.head;
		return isPalindrome(this.head);
	}

	private boolean isPalindrome(Node right) {
		if (right == null) {
			return true;
		}
		Boolean bl = isPalindrome(right.getNext());
		if (bl == false) {
			return false;
		}
		if (leftHelper.getData() != right.getData()) {
			return false;
		}
		leftHelper = leftHelper.getNext();
		return true;

	}

	public void reverseByPointer() {
		Node curr = this.head;
		Node prev = null;
		while (curr != null) {
			Node temp = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = temp;
		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}
//	public void reverseDI() throws Exception {
//		int l = 0;
//		int r = this.size - 1;
//		while (l < r) {
//			Node lNode = getNodeAt(l);
//			Node rNode = getNodeAt(r);
//			// swap
//			int temp = lNode.getData();
//			lNode.setData(rNode.getData());
//			rNode.setData(temp);
//			l++;
//			r--;
//
//		}
//
//	}

	public void reverseDataIterative(LinkedList list) {
		for (int i = 0; i < list.size; i++) {
			for (int j = 0; j < list.size; j++) {
				int temp = list.getAt(i);
				int data = list.getAt(j);
				int k = temp;
				temp = data;
				data = k;

			}
		}
	}

	public void addFirst(int data) {
		addFirst(new Node(data));
	}

	public void addFirst(Node node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head = node;
		}
		this.size++;
	}

	public void getFirst() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		} else {
			System.out.println(head.getData());
		}
	}

	public void getLast() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		} else {
			System.out.println(tail.getData());
		}
	}

	public void addLast(int data) {
		addLast(new Node(data));
	}

	public void addLast(Node node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		this.size++;
	}

	public int getAt(int i) {
		if (i >= this.size || i < 0) {
			return -1;
		} else {
			int count = 0;
			Node temp = this.head;
			while (count < i) {
				temp = temp.getNext();
				count++;
			}
			return temp.getData();
		}
	}

	public void addAtPos(int data, int pos) throws Exception {
		addAtPos(new Node(data), pos);
	}

	public void addAtPos(Node node, int pos) throws Exception {
		if (pos < 0 || pos > size)
			throw new Exception("position cannot be less than 0 and greater that size");
		if (pos == 0) {
			addFirst(node);
		} else if (pos == size) {
			addLast(node);
		} else {
			int count = 0;
			Node current = head;
			while (count < pos - 1) {
				current = current.getNext();
				count++;
			}
			node.setNext(current.getNext());
			current.setNext(node);
			size++;
		}
	}

	public Node removeFirst() throws Exception {
		Node removedNode = head;
		if (size == 0) {
			throw new Exception("there is no data");
		}
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			Node temp = head.getNext();
			head.setNext(null);
			head = temp;
		}
		size--;
		return removedNode;
	}

	public Node removeLast() throws Exception {
		Node removedNode = tail;
		if (size == 0) {
			throw new Exception("there is no data");
		}

		if (size == 1) {
			head = null;
			tail = null;
		}
		Node current = head;
		int count = 0;
		while (count < size - 2) {
			current = current.getNext();
			count++;
		}
		tail = current;
		current.setNext(current.getNext().getNext());
		this.size--;
		return removedNode;
	}

	public Node removeAtPos(int pos) throws Exception {
		if (pos < 0 || pos > size - 1) {
			throw new Exception("position cannot be less than 0 and greater that size");
		} else if (pos == 0) {
			removeFirst();
		} else if (pos == size - 1) {
			removeLast();
		} else {
			Node current = head;
			int count = 0;
			while (count < pos - 1) {
				current = current.getNext();
				count++;
			}
			Node temp = current.getNext().getNext();
			current.getNext().setNext(null);
			current.setNext(temp);
			size--;
		}
		return head;
	}

	public Node findMidWithSize() throws Exception {
		if (size == 0) {
			throw new Exception("there is no data");
		}
		int count = 0;
		Node current = head;
		int n = 0;
		if (size % 2 == 0) {
			n = (size / 2) - 1;
		} else {
			n = (size / 2);
		}
		while (count < n) {
			current = current.getNext();
			count++;
		}
		return current;
	}

	public Node findMidWithoutSize() throws Exception {
		if (size == 0) {
			throw new Exception("there is no data");
		}
		Node rabbit = head;
		Node tortoise = head;
		while (rabbit.getNext() != null && rabbit.getNext().getNext() != null) {
			rabbit = rabbit.getNext().getNext();
			tortoise = tortoise.getNext();
		}
		return tortoise;
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
	}

	public void removeDuplicate() {
		if (head == null || head.getNext() == null) {
			return;
		}
		Node curr = head;
		while (curr != null && curr.getNext() != null) {
			while (curr.getNext() != null && curr.getData() == curr.getNext().getData()) {
				curr.setNext(curr.getNext().getNext());
			}
			curr = curr.getNext();
		}

	}

	public void fold() {
		leftHelper = this.head;
		fold(this.head, 0);
	}

	private void fold(Node right, int floor) {
		// TODO Auto-generated method stub
		if (right == null) {
			return;
		}
		fold(right.getNext(), floor + 1);
		if (floor > size / 2) {
			Node currLeftNext = leftHelper.getNext();
			leftHelper.setNext(right);
			right.setNext(currLeftNext);
			leftHelper = currLeftNext;

		}
		if (floor == size / 2) {
			right.setNext(null);
			tail = right;

		}
	}

//	public void removeCycle()
//	{
//		Node curr=head;
//		boolean isCycle=isCycle(this);
//		
//		
//	}
//	public void reverseInK(int k)
//	{
//		
//	}

	public void foldLL() {
		leftHelper = this.head;
		foldLL(this.head, 0);
	}

	private void foldLL(Node right, int floor) {
		if (right == null) {
			return;
		}
		foldLL(right.getNext(), floor + 1);
		if (floor > size / 2) {
			Node currentLeftNext = leftHelper.getNext();
			leftHelper.setNext(right);
			right.setNext(currentLeftNext);
			leftHelper = currentLeftNext;
		}
		if (floor == size / 2) {
			right.setNext(null);
			tail = right;
		}
	}

//Reverse LinkedList by Data with recursion 
	public void reverse() {
		leftHelper = this.head;
		reverse(this.head, 0);
	}

	private void reverse(Node right, int floor) {
		if (right == null) {
			return;
		}
		reverse(right.getNext(), floor + 1);
		if (floor >= size / 2) {
			int temp = leftHelper.getData();
			leftHelper.setData(right.getData());
			right.setData(temp);
			leftHelper = leftHelper.getNext();
		}

	}

	public void reverseDR() {
		leftHelper = this.head;
		reverseDR(this.head, 0);
	}

	private void reverseDR(Node right, int floor) {
		if (right == null) {
			return;
		}
		reverseDR(right.getNext(), floor + 1);
		if (floor >= size / 2) {
			int temp = leftHelper.getData();
			leftHelper.setData(right.getData());
			right.setData(temp);
			leftHelper = leftHelper.getNext();
		}
	}

	public void fold2() {
		leftHelper = this.head;
		fold2(this.head, 0);
	}

	private void fold2(Node right, int i) {
		if (right == null) {
			return;
		}
		fold(right.getNext(), i + 1);
		if (i > size / 2) {
			Node curr = leftHelper;
			leftHelper.setNext(right);
			right.setNext(curr);
			leftHelper = curr;
		}
		if (i == size / 2) {
			right.setNext(null);
			leftHelper = right;
		}
	}

	public void reverseRD1() {
		leftHelper = this.head;
		reverseRd1(this.head, 0);
	}

	private void reverseRd1(Node head2, int i) {
		if (head2 == null) {
			return;
		}
		reverseRd1(head2.getNext(), i + 1);
		if (i >= this.size / 2) {
			int temp = leftHelper.getData();
			leftHelper.setData(head2.getData());
			head2.setData(temp);
			leftHelper = leftHelper.getNext();
		}
	}

	public int getKFLast(int k) {
		Node slow = this.head;
		Node Fast = this.head;
		int i = 0;
		while (i != k) {
			Fast = Fast.getNext();
			i++;
		}
		while (Fast != null) {
			slow = slow.getNext();
			Fast = Fast.getNext();
		}
		return slow.getData();
	}

	public int kFromLast(int k) {
		Node slow = this.head;
		Node fast = this.head;
		while (k-- > 0) {
			fast = fast.getNext();
		}
		while (fast != null) {
			slow = slow.getNext();
			fast = fast.getNext();
		}
		return slow.getData();
	}

	public static LinkedList mergeTwoSortedList(LinkedList l1, LinkedList l2) {
		LinkedList result = new LinkedList();
		Node left1 = l1.head;
		Node left2 = l2.head;
		while (left1 != null && left2 != null) {
			int val1 = left1.getData();
			int val2 = left2.getData();

			if (val1 < val2) {
				result.addLast(val1);
				left1 = left1.getNext();
			} else {
				result.addLast(val2);
				left2 = left2.getNext();
			}
		}
		while (left1 != null) {
			int val = left1.getData();
			result.addLast(val);
			left1 = left1.getNext();
		}
		while (left2 != null) {
			int val = left2.getData();
			result.addLast(val);
			left2 = left2.getNext();
		}
		return result;
	}
	
	public void reverseByPointerRecursively()
	{
		reverseByPointerRecursively(this.head);
		Node temp=this.tail;
		this.tail=this.head;
		this.head=temp;
		this.tail.setNext(null);
	}

	private void reverseByPointerRecursively(Node node) {
		// TODO Auto-generated method stub
		if(node.getNext()==null)
		{
			return;
		}
			reverseByPointerRecursively(node.getNext());
		    node.getNext().setNext(node);
		    
	}
	public void fold3()
	{
		leftHelper=this.head;
		fold3(this.head,0);
	}

	private void fold3(Node head2, int i) {
		// TODO Auto-generated method stub
		if(head2==null)
		{
			return;
		}
		fold3(head2.getNext(),i+1);
		if(i>size/2)
		{
			Node temp=leftHelper.getNext();
			leftHelper.setNext(head2);
			head2.setNext(temp);
			leftHelper=temp;
	    }
		if(i==size/2)
		{
			head2.setNext(null);
			tail=head2;
		}
	}
	
	public void reverseBPR()
	{
		reverseBPR(this.head);
		Node temp=this.tail;
		this.tail=this.head;
		this.head=temp;
		tail.setNext(null);
	}

	private void reverseBPR(Node node) {
		if(node.getNext()==null)
		{
			return;
		}
		reverseBPR(node.getNext());
		node.getNext().setNext(node);
	}
	
	
public static void makeCycle(LinkedList list)
{
	list.tail.setNext(list.head);
}
public static boolean isCycle(LinkedList list)
{
	Node slow=list.head;
	Node fast=list.head;
	
	while(slow!=null&&fast!=null&&fast.getClass()!=null)
	{
		slow=slow.getNext();
		fast.getNext().getNext();
		if(slow==fast)
		{
			return true;
		}
	}
	return false;
}



}