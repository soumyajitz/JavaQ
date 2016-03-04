package DSPracs;

public class MergeArray {
	// Function to merge two arrays
	public static void merge(int A[],int sizeA,int B[],int sizeB,int C[]){
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;
		while(indexA<sizeA && indexB<sizeB){
			if(A[indexA] < B[indexB])
				C[indexC++] = A[indexA++];
			else
				C[indexC++] = B[indexB++];
		}
		// if B is empty
		while(indexA<sizeA)
			C[indexC++] = A[indexA++];
		// if C is empty
		while(indexB<sizeB)
			C[indexC++] = B[indexB++];
	}
	// Display function for merged array
	public static void showMergedArray(int arr[],int size){
		for(int i = 0;i < size;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arrA[] = {12,48,64,97};
		int arrB[] = {3,6,18,79};
		int merged[] = new int[arrA.length+arrB.length];
		merge(arrA,arrA.length,arrB,arrB.length, merged);
		showMergedArray(merged,arrA.length+arrB.length);
	}
}
