import java.util.Scanner;

public class Prime {
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		boolean flag=true;
//		for(int i=2;i*i<n;i++)
//		{
//			if(n%i==0)
//		{
//		flag=false;
//		break;
//		}
//			
//		}
//		if(flag)System.out.println("prime");
//		else {System.out.println("not prime");}
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		boolean flag=true;
//		for(int i=2;i<=n/2;i++)
//		{
//			if(n%i==0)
//				{
//				flag=false;
//				break;
//				}
//				
//			
//		}
//		if(flag)System.out.println("prime");
//		else {System.out.println("not prime");}
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
}
	public static void func(int n)
	{
		boolean flag=true;
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
				{
				flag=false;
				break;
				}
				
			
		}
		if(flag)System.out.println("prime");
		else {System.out.println("not prime");}
		
		
	}


}
