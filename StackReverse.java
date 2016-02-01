package OCJP;
/*
 * Reversing a string using stack pop operation
 * */

// Basic Stack Class
class Stacks{
	private int stackSize;
	private char[] stack;
	private int top;
	
	public Stacks(int size){
		stackSize = size;
		stack = new char[stackSize];
		top = -1;
	}
	// Push an item onto the stack
	public void push(char item){
		stack[++top] = item;
	}
	// Pop an item from the stack
	public char pop(){
		return stack[top--];
	}
	// Display the item at the top
	public char seek(){
		return stack[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
}

// Reverse of a string class
class Reverse{
	// Input String
	String inp;
	// Output String
	String out = "";
	public Reverse(String i){
		inp = i;
	}
	
	public String reverse(){
		int size = inp.length();
		Stacks s = new Stacks(size);
		// Push the items in the stack for further popping
		for(int i = 0; i < inp.length(); i++){
			char ch = inp.charAt(i);
			s.push(ch);
		}
		// Pop the items from the stack to create the reverse string
		for( int j = 0;j< inp.length(); j++){
			char ch = s.pop();
			out = out + ch;
		}
		
		return out;
	}
}

public class StackReverse {
	public static void main(String[] args) {
		Reverse r = new Reverse("soumyajitsarkar");
		String rev = r.reverse();
		System.out.println(rev);
		
	}

}
