package OCJP;

import java.util.*;

// Create stack class
class Stack1{
	private int size;
	private int[] stack;
	private int top;
	
	public Stack1(int mSize){
		size = mSize;
		stack = new int[mSize];
		top = -1;
	}
	
	public void push(int item){
		stack[++top] = item;
	}
	
	public int pop(){
		return stack[top--];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public int seekN(int n){
		return stack[n];
	}
	
	public int size(){
		return top+1;
	}
	
	public void display(String s){
		System.out.print(s);
		System.out.println("Stack (Low -> Top): ");
		for(int j =0;j<size();j++){
			System.out.print(seekN(j));
			System.out.print(' ');
		}
		System.out.println();
	}
	
}

class PostFix{
	private Stack1 s;
	private String in;
	
	public PostFix(String s){
		in = s;
	}
	// Method for parsing each and every element of the string and push it to stack
	public int post(){
		s = new Stack1(30);
		char ch;
		int pop1,pop2,ans;
		
		for(int j=0;j<in.length();j++){
			ch = in.charAt(j);
			s.display(" "+ch+" ");
			// push the operands to stack
			if(ch >= '0' && ch <= '9'){
				s.push((int)(ch-'0'));
			}
			else
			// if an operator is found, simply pop the last 2 numbers and operate it and push in the stack
			{
				pop2 = s.pop();
				pop1 = s.pop();
				switch(ch){
				case '+': 
					ans = pop1 + pop2;
					break;
				case '-': 
					ans = Math.abs(pop1 - pop2);
					break;
				case '*': 
					ans = pop1 * pop2;
					break;
				case '/': 
					ans = pop1 / pop2;
					break;
				default: 
					ans = 0;
				}
				s.push(ans);
			}
		}
		ans = s.pop();
		return ans;
	}
}

public class PostFixEval {
	
	public static String inputString() 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
	
	public static void main(String[] args) {
		String in;
		int out;
		System.out.println("Read a String :");
		in = inputString();
		PostFix p = new PostFix(in);
		out = p.post();
		System.out.println("PostFix eval is: "+out);
		
	}

}
