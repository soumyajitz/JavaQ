package OCJP;
import java.util.*;

class StringPerm{
	
	public  ArrayList<Character> compute(String s){
		char k[] = s.toCharArray();
		ArrayList<Character> a = new ArrayList<Character>();
		for(char val:k)
			a.add(val);
		Collections.sort(a);
		return a;
	}
	
	public boolean permutation(String s1,String s2){
		if(s1.length() != s2.length())
			return false;
		ArrayList<Character> a1 = compute(s1);
		ArrayList<Character> a2 = compute(s2);
		if(a1.equals(a2))
			return true;
		return false;
	}
}

public class StringPermutation {
	public static void main(String[] args) {
		StringPerm p = new StringPerm();
		boolean b; 
		b = p.permutation("hello", "lloeh");
		if(b)
			System.out.println("Permutation");
		else
			System.out.println("Not a permutation");
	}

}
