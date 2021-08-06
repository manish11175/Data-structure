package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Util {

	public static String resolveDirectory(String s) {
		String strings[] = s.split("/");
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equals("..")) {
				stack.pop();
			} else if (strings[i].equals(" ")) {
				continue;
			} else {
				stack.push(strings[i]);
			}
		}
		StringBuffer stringbuffer = new StringBuffer();
		while (!stack.isEmpty()) {
			stringbuffer.append(stack.pop()).append("/");

		}
		return stringbuffer.reverse().toString();
	}

	public static List<Integer> removeDuplicate(List<Integer> arr) {
		Stack<Integer> stack = new Stack();
		// iterater
		for (int a : arr) {
			if (!stack.isEmpty() && stack.peek() == a) {
				stack.pop();
			} else {
				stack.push(a);
			}

		}
		ArrayList result = new ArrayList<Integer>();
		while (!stack.isEmpty()) {
			result.add(stack.pop());
		}
		return result;
	}

	public static void nextGreaterElement(List<Integer> list) {
		Stack<Integer> stack = new Stack<>();
		for (int a : list) {
			while (!stack.isEmpty() && stack.peek() < a) {
				int temp = stack.pop();
				System.out.println(temp + "------->" + a);
			}
			stack.push(a);
		}
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			System.out.println(temp + "------->" + -1);
		}

	}

	public static void largestRetangularHisto(int arr[]) {
		int leftBound[] = new int[arr.length];
		int rightBound[] = new int[arr.length];

		Stack<Integer> stack = new Stack<>();

		stack.push(0);
		leftBound[0] = -1;
		for (int i = 1; i < arr.length; i++) {
			while (stack.size() > 0 && arr[i] < arr[stack.peek()]) {
				stack.pop();

			}
			if (stack.size() != 0) {
				leftBound[i] = stack.peek();
			} else {
				leftBound[i] = -1;
			}
			stack.push(i);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			while (stack.size() > 0 && arr[i] < arr[stack.peek()]) {
				int temp = stack.pop();
				System.out.println("temp" + temp);
			}
			if (stack.size() != 0) {
				rightBound[i] = stack.peek();
				System.out.println("peek" + stack.peek());
			} else {
				rightBound[i] = arr.length;
				System.out.println("right" + rightBound[i]);
			}
			System.out.println("i" + i);
			stack.push(i);

		}

		int maxArea = 0;
		for (int i = 0; i < arr.length; i++) {
			int area = arr[i] * (rightBound[i] - leftBound[i] - 1);
			maxArea = Math.max(area, maxArea);
		}
		System.out.println(maxArea);

	}
	
	public static int largestRectangleArea(int[] heights) {
	        int length = heights.length;
	        int maxArea = 0;
	        int[] lesserLeft = new int[length];
	        int[] lesserRight = new int[length];
	        
	        lesserLeft[0] = -1;
	        lesserRight[length - 1] = length;
	        
	        for(int i = 1; i < length; i++){
	            int index = i - 1;
	            while(index >= 0 && heights[index] >= heights[i]){
	                index = lesserLeft[index];
	            }
	            lesserLeft[i] = index;
	        }
	        
	        for(int i = length - 2; i >= 0; i--){
	            int index = i + 1;
	            while(index < length && heights[index] >= heights[i]){
	                index = lesserRight[index];
	            }
	            lesserRight[i] = index;
	        }
	        
	        for(int i = 0; i < length; i++){
	            int area = heights[i] * (lesserRight[i] - lesserLeft[i] - 1);
	            maxArea = Math.max(area, maxArea);
	        }
	        
	        return maxArea;
    }



	public static boolean isBalancedParenthesis(String parenthesis) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < parenthesis.length(); i++) {

			if (parenthesis.charAt(i) == '{') {
				stack.push(parenthesis.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	public static void stockSpan(List<Integer> list) {
		Stack<Integer> stack = new Stack<>();
		for (int a : list) {
			while (!stack.isEmpty() && stack.peek() < a) {
				stack.pop();

			}
			stack.push(a);
		}
		System.out.println(stack);

	}

	public static int[] spanStock(int arr[]) {
		int[] span = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		span[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			while (stack.size() > 0 && arr[i] > arr[stack.peek()]) {
				stack.pop();
			}
			if (stack.size() == 0) {
				span[i] = i + 1;
			} else {
				span[i] = i - stack.peek();
			}
			stack.push(i);
		}
		return span;
	}

	public static int[] stockSpan(int[] arr) {
		int[] span = new int[arr.length];

		Stack<Integer> st = new Stack<>();
		st.push(0);
		span[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] > arr[st.peek()]) {
				st.pop();
			}

			if (st.size() == 0) {
				span[i] = i + 1;
			} else {
				span[i] = i - st.peek();
			}

			st.push(i);
		}

		return span;
	}

	public static int largestAreaHistogram(int[] arr) {
		int[] lb = new int[arr.length];
		int[] rb = new int[arr.length];

//		calculating lb and rb 

		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		lb[0] = -1;
		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] < arr[st.peek()]) {
				st.pop();
			}

			if (st.size() != 0) {
				lb[i] = st.peek();
			} else {
				lb[i] = -1;
			}
			st.push(i);
			;
		}

		st = new Stack<Integer>();
		st.push(arr.length - 1);
		rb[arr.length - 1] = arr.length;
		for (int i = arr.length - 2; i >= 0; i--) {
			while (st.size() > 0 && arr[i] < arr[st.peek()]) {
				st.pop();
			}

			if (st.size() != 0) {
				rb[i] = st.peek();
			} else {
				rb[i] = arr.length;
			}
			st.push(i);
		}

		int maxArea = 0;
		for (int i = 0; i < arr.length; i++) {
			int area = arr[i] * (rb[i] - lb[i] - 1);

			maxArea = Math.max(maxArea, area);
		}

		return maxArea;
	}

	public static int infixEvaluation(String exp) {
		Stack<Integer> opnds = new Stack<Integer>();
		Stack<Character> oprts = new Stack<Character>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (ch == '(') {
				oprts.push(ch);
			} else if (Character.isDigit(ch)) {
				opnds.push(ch - '0');
			} else if (ch == ')') {
				while (oprts.peek() != '(') {
					char optor = oprts.pop();
					int v2 = opnds.pop();
					int v1 = opnds.pop();
					int opv = operation(v1, v2, optor);
					opnds.push(opv);
				}
				oprts.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while (oprts.size() > 0 && oprts.peek() != '(' && precedence(ch) <= precedence(oprts.peek())) {
					char optor = oprts.pop();
					int v2 = opnds.pop();
					int v1 = opnds.pop();
					int opv = operation(v1, v2, optor);
					opnds.push(opv);
				}

				oprts.push(ch);
			}

		}

		while (oprts.size() > 0) {
			char optor = oprts.pop();
			int v2 = opnds.pop();
			int v1 = opnds.pop();
			int opv = operation(v1, v2, optor);
			opnds.push(opv);
		}
		return opnds.peek();
	}

	public static int precedence(char opt) {
		if (opt == '+' || opt == '-') {
			return 1;
		} else {
			return 2;
		}
	}

	public static int operation(int v1, int v2, char opt) {

		if (opt == '+') {
			return v1 + v2;
		} else if (opt == '-') {
			return v1 - v2;
		} else if (opt == '*') {
			return v1 * v2;
		} else {
			return v1 / v2;
		}
	}

	public static void sortUtil(Stack<Integer> stack) {

		if (stack.isEmpty())
			return;

		int temp = stack.pop();
		sortUtil(stack);
		sortInserted(stack, temp);
	}

	public static void sortInserted(Stack<Integer> stack, int element) {

		if (stack.isEmpty() || element > stack.peek()) {
			stack.push(element);
			return;
		}
		int temp = stack.pop();
		sortInserted(stack, element);
		stack.push(temp);
	}

	public static String postfix(String infix) {
		StringBuffer result = new StringBuffer();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < infix.length(); i++) {
			Character c = infix.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				result.append(c);
			} 
			else if (c == '(') {
				stack.push(c);

			}
			else if(c==')') {
				while(!stack.isEmpty() && stack.peek()!='(')
				{
					result.append(stack.pop());
				}
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && precedance(c)<precedance(stack.peek()))
				{
					result.append(stack.pop());
					
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
		{
			result.append(stack.pop());
		}
		return result.toString();
	}
	
	public static String infix2Postfix(String string)
	{
		StringBuffer result=new StringBuffer();
		Stack<Character>stack=new Stack<>();
		for(int i=0;i<string.length();i++)
		{
			Character c=string.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				result.append(c);
			}
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')')
			{
				while(!stack.isEmpty() && stack.peek()!='(')
				{
					result.append(stack.pop());
				}
				stack.pop();
			}
			else 
			{
				while(!stack.isEmpty()&& precedance(c)<precedance(stack.peek()))
				{
					result.append(stack.pop());
					
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
		{
			result.append(stack.pop());
			
		}
		return result.toString();
		
		
	}

	public static int precedance(char ch) {
		switch (ch) {
		case '^':
			return 3;
		case '*':
		case '/':
		case '%':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			return 0;
		}
	}

	public static Stack<Interval> mergeInterval(List<Interval> list) {

		Collections.sort(list);
		Stack<Interval> stack = new Stack<>();
		for (Interval it : list) {
			if (stack.isEmpty()) {
				stack.push(it);
			} else if (stack.peek().end < it.start) {
				stack.push(it);
			} else if (stack.peek().end < it.end) {
				stack.peek().end = it.end;
			}

		}
		return stack;

	}
}

class Interval implements Comparable<Interval> {
	int start;
	int end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Interval o) {
		// TODO Auto-generated method stub
		return this.start - o.start;
	}

	@Override
	public String toString() {
		return (this.start + " " + this.end);
	}
	

}