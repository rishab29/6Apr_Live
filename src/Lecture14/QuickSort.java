package Lecture14;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
		quicksort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void quicksort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int pindex = partition(arr, si, ei);
		quicksort(arr, si, pindex - 1);
		quicksort(arr, pindex + 1, ei);
	}

	public static int partition(int[] arr, int si, int ei) {

		int pivot = arr[ei];
		int pindex = si;
		for (int i = si; i <= ei - 1; i++) {
			if (arr[i] <= pivot) {
				swap(arr, i, pindex);
				pindex++;
			}
		}

		swap(arr, pindex, ei);
		return pindex;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
