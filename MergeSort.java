package DSPracs;
// This is the class in which all the merge sort algorithm will be written
class MergeArr{
	private int[] arr;
	private int numElems;
	// Create the constructor
	public MergeArr(int size){
		arr = new int[size];
		numElems = 0;
	}
	// Write the insert method
	public void insert(int val){
		arr[numElems] = val;
		numElems++;
	}
	// display the array data
	public void show(){
		for(int i = 0;i<numElems;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
	// Sort function
	public void Sort(){
		int[] mergeArray = new int[numElems];
		mergeSort(mergeArray,0,numElems-1);
	}
	// Write the recursive merge function
	private void mergeSort(int[] mergeArray,int low,int high){
		// base case condition
		if(low == high)
			return;
		else {
			int mid = (low+high)/2;
			mergeSort(mergeArray,low,mid);
			mergeSort(mergeArray,mid+1,high);
			merge(mergeArray,low,mid+1,high);
		}
	}
	// Now write the merge function to merge the divided arrays
	public void merge(int[] mergeArray,int lowPtr,int highPtr, int upperbound){
		int j =0;		// index of mergeArray
		int lowerBound = lowPtr;
		int mid = highPtr-1;
		int n = upperbound-lowerBound+1;
		// if neither is empty
		while(lowPtr<= mid && highPtr <= upperbound){
			if(arr[lowPtr]<arr[highPtr]){
				mergeArray[j++] = arr[lowPtr++];
			}
			else {
				mergeArray[j++] = arr[highPtr++];
			}
		}
		// if second array is empty
		while(lowPtr<=mid)
			mergeArray[j++] = arr[lowPtr++];
		// if first array is empty
		while(highPtr<= upperbound)
			mergeArray[j++] = arr[highPtr++];
		
		for(j = 0;j<n;j++)
			arr[lowerBound+j] = mergeArray[j];
	}
	
}

public class MergeSort {
	public static void main(String[] args) {
		int maxSize = 100;
		MergeArr m = new MergeArr(maxSize);
		m.insert(34);
		m.insert(12);
		m.insert(67);
		m.insert(8);
		m.insert(-4);
		m.insert(23);
		m.insert(-12);
		System.out.println("Before Sorting");
		m.show();
		m.Sort();
		System.out.println("After Sorting");
		m.show();
		
		
	}

}
