package datastructure.binarySearch;

public class WallPartion {

	public static void main(String[] args) {
		int wall[]= {10,20,30,40,40,50};
		int k=2;
		
		partionWall(wall,k);

	}
	public static void partionWall(int wall[],int k)
	{
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int e:wall)
		{
			sum+=e;
			max=Math.max(max, e);
		}
	int low=max;
	int high=sum;
	while(low<high)
	{
		int mid=(low+high)/2;
		int painter=painterCount(wall,mid);
		if(painter<=k)
		{
			high=mid;
			
		}
		else {
			low=mid+1;
		}
	}
	System.out.println("maximum part of consecutive wall "+low);
	}
	public static int painterCount(int wall[],int mid)
	{
		int count=1;
		int sum=0;
		for(int i=0;i<wall.length;i++)
		{
			sum+=wall[i];
			if(sum>mid)
			{
				sum=wall[i];
				count++;
			}
		}
		return count;
	}
	
	

}
