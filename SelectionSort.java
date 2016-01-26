package OCJP;
class SelectionSortAlgo{
	// Creating private specifier for array in order to preserve encapsulation
	private long arr[];
	// number of elements in the array
	private int numElements;
	// Constructor function for value of array length
	public SelectionSortAlgo(int maxVal){
		arr = new long[maxVal];
		numElements = 0;
	}
	// Insertion of elements in array with automatic indexing
	public void insert(int value){
		arr[numElements] = value;
		numElements++;
	}
	// Print the array elements
	public void display(){
		for(int i = 0;i<numElements;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	// Swap 2 numbers in an array
	public void swap(int a,int b){
		long temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	// Selection sort Algo
	/*
	 * At first, the first element in the array is considered the minimum and compared with all the other elements for potential
	 * swapping, then after the smalles element is found: the same process is being done with the rest of the elements to find
	 * the second smallest element and the process goes on. 
	 * */
	public void selectionsort(){
		int i,j,min;
		for(j=0;j<numElements-1;j++){
			min = j;
			for(i=j+1;i<numElements;i++){
				if(arr[i]<arr[min]){
					swap(i,min);
				}
			}
		}
	}
	
}
public class SelectionSort {
	public static void main(String[] args) {
		SelectionSortAlgo s = new SelectionSortAlgo(10);
		s.insert(23);
		s.insert(12);
		s.insert(-3);
		s.insert(100);
		s.insert(89);
		System.out.println("Before Sorting: -----------------------------------------");
		s.display();
		s.selectionsort();
		System.out.println("After Sorting: ------------------------------------------");
		s.display();
	}

}
