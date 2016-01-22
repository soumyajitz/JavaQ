package OCJP;
import java.util.*;
class myArray{
	private long[] value;
	private int numElements;
	// Creating the constructor
	public myArray(int size){
		value = new long[size];
		numElements = 0;
	}
	// Create a search class
	public boolean search(long key){
		int j;
		for(j=0;j<numElements;j++)
			if(value[j] == key)
				break;
			if(j == numElements)
				return false;
			else 
				return true;
	}
	// Creating the insert method
	public void insert(long val){
		value[numElements] = val;
		numElements++;
	}
	// Create a delete method
	public boolean delete(long val){
		int j;
		for(j=0;j<numElements;j++)
			if(val == value[j])
				break;
			if(j == numElements)
				return false;
			else
			{
				int k;
				for(k=j;k<numElements;k++){
					value[k] = value[k+1];
				}
				numElements--;
				return true;
			}
	}
	// Display method for the array
	public void display(){
		for(int i = 0;i<numElements;i++){
			System.out.print(value[i]+" ");
		}
		System.out.println();
	}
	
}
public class arrayOps {
	public static void main(String args[]){
		myArray arr = new myArray(10);
		arr.insert(10);
		arr.insert(20);
		arr.insert(25);
		arr.insert(35);
		arr.insert(47);
		arr.insert(89);
		arr.insert(71);
		arr.insert(99);
		arr.display();
		arr.delete(20);
		arr.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key to search:");
		long key = sc.nextLong();
		if(arr.search(key)){
			System.out.println("Found key");
		}
		else{
			System.out.println("Key not Found");
		}
		
	}

}
