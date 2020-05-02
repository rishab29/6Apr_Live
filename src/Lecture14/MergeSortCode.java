package Lecture14;

public class MergeSortCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr={60,10,50,40,30,20,70};
       
       int[] sorted=mergeSort(arr, 0, arr.length-1);
       for(int i=0;i<sorted.length;i++) {
    	   System.out.print(sorted[i]+" ");
       }
	}

	public static int[] mergeSort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] br = new int[1];
			br[0] = arr[si];
			return br;
		}
		int mid = (si + ei) / 2;
		int[] one = mergeSort(arr, si, mid);
		int[] two = mergeSort(arr, mid + 1, ei);
		int[] sorted = merge(one, two);

		return sorted;
	}

	public static int[] merge(int[] one, int[] two) {
		int[] sorted = new int[one.length + two.length];

		int i = 0, j = 0, k = 0;

		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				sorted[k] = one[i];
				i++;
				k++;
			} else {
				sorted[k] = two[j];
				j++;
				k++;
			}
		}

		while (i < one.length) {
			sorted[k] = one[i];
			i++;
			k++;
		}

		while (j < two.length) {
			sorted[k] = two[j];
			j++;
			k++;
		}

		return sorted;
	}

}
