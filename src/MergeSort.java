
public class MergeSort {

	void merge(int[] a, int left, int mid,int right) {
		System.out.println("Called merge with left: " +left+" mid: "+mid +" right: "+right);
		int firstsubarraylength = mid-left+1;
		int rightsubarraylength = right-mid;

		int[] firstsubarray= new int[firstsubarraylength];
		int[] secondsubarray = new int[rightsubarraylength];

		for(int i=0; i< firstsubarraylength;i++ ){
			firstsubarray[i]= a[left+i];
		}
		for (int i = 0; i < rightsubarraylength; i++) {
			secondsubarray[i]=a[mid+1+i];
		}
		
		int i,j,k;
		i=0;
		j=0;
		k=left;

		while(i< firstsubarraylength && j< rightsubarraylength) {
			if( firstsubarray[i] <= secondsubarray[j] ) {
				a[k]=firstsubarray[i];
				i++;k++;
			}
			else {
				a[k]=secondsubarray[j];
				j++;
				k++;
			}
		}
			while(i< firstsubarraylength) {
				a[k] = firstsubarray[i];
				i++;k++;
			}
			while(j < rightsubarraylength) {
				a[k]= secondsubarray[j];
				j++;
				k++;
			}
	}
	void performMergesort(int a[],int left, int right) {
		System.out.println("Called performMergeSort with Left: " +left +" right: "+right);
		if (left < right) {
		int mid = (left+right)/2;
		System.out.println("Found left " +left+ " is < than right " +right + " and mid is " +mid);
		System.out.println("Calling Perform Merge for left subarray");
		performMergesort(a,left,mid);
		System.out.println("Calling Perform Merge for right subarray");
		performMergesort(a,mid+1,right);
		System.out.println("Calling Merge for both subarrays");
		merge(a,left,mid,right);
		}
	}
	
	static void display(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,9,-1,7,6};
		System.out.println("Displaying Input array elements \n");
		display(a);
		System.out.println("Starting Merge Sort Now!");
		MergeSort mob = new MergeSort();
		mob.performMergesort(a, 0, a.length-1);
		System.out.println("Merge Sorted output \n");
		display(a);
	}

}
