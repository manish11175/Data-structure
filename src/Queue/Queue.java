package Queue;

public class Queue {
	int[] data;
	int rear;
	int front;
	int size;

	Queue(int cap) {
		this.front = -1;
		this.rear = -1;
		this.data = new int[cap];
	}

	public void enqueue(int val) throws Exception {

		if (this.size == this.data.length) {
			throw new Exception("Queue is Overflow");
		}
		rear++;
		this.rear=this.rear%data.length;
		this.data[rear] = val;
		if(this.front==-1)
		{
			this.front++;
		}
		this.size++;

	}

	public int dequeue() throws Exception {

		if (this.size == 0) {
			throw new Exception("Queue is Empty");
		}
		int temp = data[this.front];
		this.size--;
		this.front++;
		this.front=this.front%data.length;
		return temp;
	}

	public int front() throws Exception {

		if (this.size == 0) {
			throw new Exception("Queue is Empty");
		}
		return this.data[this.front];
	}

	public int rear()throws Exception {
	  if(this.size==0)
	  {
		  throw new Exception("Queue is Empty");
	  }
	  return this.data[this.rear];
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		}
		return false;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(data[(i + this.front)%data.length] + " ");
		}
	}
}
