package OCJP;

import java.util.*;
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
		System.out.println(" ");
	}
	
}

class PostFix{
	private Stack1 s;
	private String in;
	
	public PostFix(String s){
		in = s;
	}
	
	public int post(){
		s = new Stack1(30);
		char ch;
		int j;
		int pop1,pop2,ans;
		
		for(j=0;j<in.length();j++){
			ch = in.charAt(j);
			s.display(" "+ch+" ");
			if(ch >= '0' && ch <= '9'){
				s.push((int)(ch-'0'));
			}
			else {
				pop1 = s.pop();
				pop2 = s.pop();
				switch(ch){
				case '+': 
					ans = pop1 + pop2;
					break;
				case '-': 
					ans = pop1 - pop2;
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
