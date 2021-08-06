package datastructure;

public class QueueArray {
	  public static int front=0;
	  public static int rear=-1;
	  public static int size=0;
	public static void main(String[] args) {
       int n=4;
       int queue[]=new int[n];
       insert(queue,1);
       insert(queue,2);
       insert(queue,3);
       insert(queue,4);
       delete(queue);
       delete(queue);
       delete(queue);
       insert(queue,5);
       insert(queue,6);
       
       printQueue(queue);
       System.out.println("rear index "+ rear);
       System.out.println("front index "+front);
       
	}
	public static void printQueue(int queue[])
	{
		System.out.println("Front element is "+ queue[front]);
		System.out.println("Rear element is "+ queue[rear]);
	}
	public static boolean isEmpty(int queue[])
	{ 
		return size==0;
	}
    public static boolean overFlow(int []queue)
    {
    	return (size==queue.length);
    }
	public  static void insert(int queue[],int num)
	{
		if(overFlow(queue))
		{
			System.out.println("Queue is Full");
			return;	
		}
		
		else
			{
			rear=(rear+1)%queue.length;
			queue[rear]=num;
			
			 size++;
			System.out.println(num+" is inserted successfully");
		}
		
	}
	public  static void delete(int queue[])
	{
		if(isEmpty(queue))
		{
			System.out.println("queue is empty");
			return;
		}
			
		else{
			int item=queue[front];
			size--;
			front=(front+1)%queue.length;
			System.out.println(item+" is delete successfully");
		}
		
	}


}
