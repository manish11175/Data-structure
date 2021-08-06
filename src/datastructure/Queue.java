package datastructure;

public class Queue {
     int rear,front,size,capacity;
     int array[];
	Queue(int capacity)
	{
		this.capacity=capacity;
		front=size=0;
		rear=capacity-1;
		array=new int[capacity];
		
	}
	
	boolean isEmpty(Queue queue)
	{
		return (queue.size==0);
	}
	boolean isFull(Queue queue)
	{
		return (queue.capacity==queue.size);
	}
	
	void insert(int val)
	{
		if(isFull(this))
		{
			System.out.println("Queue is full");
		    return;
		}
		else {
			rear=(rear+1)%capacity;
			array[this.rear]=val;
			size++;
			System.out.println(val+" inserted");
		}
		
	}
	void delete()
	{
		if(isEmpty(this))
		{
			System.out.println("Queue is empty");
			
		}
		else {
			int item=array[this.front];
			front=(front+1)%capacity;
            size--;
              System.out.println(item +" is deleted");
        }
	}
	
	void front()
	{
		if(!isEmpty(this))
		{
			System.out.println("front element is "+array[this.front]);
					
		}
	}
	void rear()
	{
		if(!isEmpty(this))
		{
			System.out.println("Rear element is "+array[this.rear]);
		}
	}
	public static void main(String[] args) {
		
		Queue q=new Queue(4);
		q.delete();
		q.front();
		q.rear();
		
		
	}

}
