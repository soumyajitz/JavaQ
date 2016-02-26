package DSPracs;
import java.util.*;
public class WordPermutation {

	public static int size;
	public static int count;
	public static char[] arr = new char[200];
	// This is the permutation function
	public static void doPerm(int wordSize){
		if(wordSize == 1){
			return;
		}
		for(int j=0;j<wordSize;j++)
		{
			doPerm(wordSize-1);
			if(wordSize == 2)
				display();
			rotate(wordSize);
		}
	}
	
	public static void rotate(int wordSize){
		int k;
		int pos = size-wordSize;
		char t = arr[pos];
		for(k=pos+1;k<size;k++){
			arr[k-1] = arr[k];
		}
		arr[k-1] = t;
	}
	
	public static void display(){
		if(count<99)
			System.out.print(" ");
		if(count<9)
			System.out.print(" ");
		System.out.print(++count+" ");
		for(int j=0;j<size;j++){
			System.out.print(arr[j]);
		}
		System.out.print("\t");
		if(count%5 ==0)
			System.out.println();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter a word for permutation:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		size = input.length();
		count = 0;
		for(int j = 0;j<input.length();j++){
			arr[j] = input.charAt(j);
		}
		doPerm(size);
	}

}
