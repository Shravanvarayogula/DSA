
public class SelectionSort {
	static void performSelectionsort(int a[]) {
		int count=0;
		for (int i = 0; i < a.length-1; i++) {
			int index = i; 
			for (int j = i+1; j <a.length; j++) {
				if(a[j] < a[index]) {
					index = j;
				}
			}
			int smallestnumber = a[index];
			a[index] = a[i];
			a[i] = smallestnumber;
			count++;
		}
		System.out.println("I "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,7,8,5,4};
		System.out.println("Printing Array Elements");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		performSelectionsort(a);
		System.out.println("Sorted Input Array by Selection Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
