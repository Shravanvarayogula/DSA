
public class BubbleSort {
	static void performBubblesort(int a[]) {
		int size = a.length;
		int temp =0;
		for (int i = 0; i < size; i++) { 
			for (int j = 1; j < (size-i); j++) {	
				if ( a[j-1] > a[j]){
					temp = a[j-1];
					a[j-1] =  a[j];
					a[j] = temp;
				}
			}
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,5,2,3,1,6,7};
		System.out.println("Printing Array Elements");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();


		performBubblesort(a);

		System.out.println("Sorted Input Array using Bubble Sort");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
