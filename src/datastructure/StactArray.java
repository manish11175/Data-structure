package datastructure;

public class StactArray {
	public static int idx = -1;

	public static void main(String[] args) {
		int n = 4;

		int stack[] = new int[n];
		push(stack, 7);
		push(stack, 6);
		push(stack, 6);
		
		pop(stack);
		pop(stack);
	
		print(stack);
		
	}
	public static void print(int stack[])
	{
		for(int e:stack)
		{
			System.out.println(e);
		}
	}

	public static void printStack(int stack[]) {
		while(!isEmpty())
		{
			peek(stack);
			pop(stack);
		}
		System.out.println("stack is empty now");
	}

	public static void peek(int stack[])
	{
		System.out.println(stack[idx]);
	}
	public static boolean isEmpty() {
		if (idx ==-1)
			return true;
		else {
			return false;
		}
	}
	public static boolean isFull(int stack[]) {
		if (idx==stack.length-1)
			return true;
		else {
			return false;
		}
	}

	public static void push(int[] stack, int num) {
		if (!isFull(stack)) {
			idx++;
			stack[idx] = num;
			
			System.out.println(num+" pushed in stack");
		} else
			System.out.println("Stack full");

	}
	
	
	public static void pop(int stack[]) {
        if(!isEmpty())
        {
        	int popele=stack[idx];
        	stack[idx]=0;
        	
            System.out.println(popele+" is poped");
            idx--;
        }
        else {
        	System.out.println("stack is empty");
        }
	}

}
