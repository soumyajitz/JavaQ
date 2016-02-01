import java.math.*;
import java.util.*;
public class PrimeNo {
	public static void main(String[] args) {
		int n =500000;
		ArrayList<Integer> al = new ArrayList<Integer>();
		long t1 = System.currentTimeMillis();
		System.out.println("Time Now: "+t1);
		boolean flag = false;
		for(int i=2;i<n;i++){
			if(Prime.isPrime(i)){
				al.add(i);
			}
		}
		long t2 = System.currentTimeMillis();
		System.out.println("List is: "+al);
		System.out.println("Time Later:"+t2);
		System.out.println("Time diff: "+(t2-t1)+" milliseconds");
		
		
	}

}
