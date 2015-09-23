
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class myStack<E> {
	ArrayList<E> stack = new ArrayList<E>();
	public int getsize(){
		return stack.size();
	}
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	public E peek(){
		return stack.get(getsize()-1);
	}
	public void push(E o){
		stack.add(o);
	}
	public E pop(){
		E o = stack.get(getsize()-1);
		stack.remove(getsize()-1);
		return o;
	}
	public <E> void printlist(){
		ListIterator<E> it = (ListIterator<E>) stack.listIterator(getsize());
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
	}
}
public class GenericStack{
	public static void main(String[] args){
		myStack<String> s = new myStack<String>();
		s.push("Hello");
		s.push("World");
		s.push("This");
		s.push("Program");
		System.out.println("Number of Elements before:"+s.peek());
		System.out.println("\n"+"Before pop------------------"+"\n");
		s.printlist();
	System.out.println("\n"+"After pop-----------------------"+s.pop()+"\n");
		s.printlist();
		System.out.println("Number of Elements after:"+s.peek());
		
	}
}

