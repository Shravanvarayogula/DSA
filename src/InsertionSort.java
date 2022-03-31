

/**
 * Pseudo Code:
 * 1. Start
 * 2. Initialize variables for iteration i, partition tracking j, current key k 
 * 3. for (j -> n) {
 * 		start with index 1, 
 * 		check position for the current element in sorted part,
 * 		if the current element is smallest then insert at the left indices or the other way
 * 		For each rearrangement till the end of the array, 
 * 		the array is sorted from the left position.
 * }
 * 		
 * 
 * @author Shravan
 *
 */
public class InsertionSort {
	static void performInsertionsort(int a[]) {
		int iterations = 0;
		for (int j = 1; j < a.length; j++) {
			int currentelement = a[j]; 
			int partition = j-1;
			while(partition > -1 && a[partition] > currentelement) {
				a[partition+1] = a[partition];
				partition--;
			}
			a[partition+1] = currentelement;
			iterations++;

			}
		System.out.println("Iterations: "+iterations);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,7,6,9,8,-1,-2,6,-5,-7};
		System.out.println("Printing Array Elements");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		performInsertionsort(a);
		System.out.println("Sorted Input Array by Insertion Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}

}

