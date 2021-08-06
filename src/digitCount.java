
public class digitCount {

	public static void main(String[] args) {
		int count=0;
		int num=1655;
		
		while(num>0)
		{
			int rem=num%10;
			count=count*10+rem;
			num=num/10;
		}
		System.out.println(count);
	}

}
