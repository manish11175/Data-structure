package recursion.questionanswerapproach;

public class NLexigraphically {

	public static void main(String[] args) {

		printLexigraphically(1, 10);
	}

	public static void printNLexigraphically(int num, int max) {
		System.out.println(num);
		for (int j = 0; j < 10; j++) {
			if (num * 10 + j <= max)
				
			{
				printNLexigraphically(num * 10 + j, max);

			}
		}
		if (num < 9) {
			printNLexigraphically(num + 1, max);

		}
	}
	
	public static void printLexigraphically(int num,int max)
	{
		System.out.println(num);
		for(int i=0;i<9;i++)
		{
			if(num*10+i<=max)
			{
				printLexigraphically(num*10+i,max);
			}
		}
		if(num<9)
		{
			printLexigraphically(num+1,max);	
		}
	}
}
