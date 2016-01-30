// Program to find out whether a String is a permutation of the other or not
import java.util.*;

class StringPerm{
	public boolean permutation(String s1,String s2){
		if(s1.length() != s2.length())
			return false;
		char k1[] = s1.toCharArray();
		char k2[] = s2.toCharArray();
		ArrayList<Character> a1 = new ArrayList<Character>();
		ArrayList<Character> a2 = new ArrayList<Character>();
		for(char k:k1){
			a1.add(k);
		}
		for(char k:k2){
			a2.add(k);
		}
		Collections.sort(a1);
		Collections.sort(a2);
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
