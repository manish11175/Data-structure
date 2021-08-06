package Queue;

public class DynamicQueue extends Queue {
	DynamicQueue(int cap)
	{
		super(cap);
	}
  @Override
  public void enqueue(int val)throws Exception
  {
	  if(this.size==this.data.length)
	  {
		  int oa[]=this.data;
		  this.data=new int[2*oa.length];
		  for(int i=0;i<size;i++)
		  {
			  this.data[i]=oa[(i+front)%oa.length];
		  }
		  this.front=0;
		  this.rear=this.size-1;
		  
	  }
	  this.rear++;
	  this.rear=this.rear%this.data.length;
	  this.data[this.rear]=val;
	  if(this.front==-1)
	  {
		  this.front++;
	  }
	  this.size++;
  }
}
