package Lecture6;

public class ArrayQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 3, 9, 8, 1, 6 };
////		display(arr);
////		reverse(arr);
////		display(arr);
////		
////		System.out.println(linearSearch(arr, 100));
////		
//
//		display(arr);
//		insertionSort(arr);
//		display(arr);

		int[] arr= {3,1,5,-2,-4,6};
		System.out.println(maxSubArraySum(arr));
	}

	public static void reverse(int[] arr) {
		int i = 0, j = arr.length - 1;

		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}

	public static int linearSearch(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}

		return -1;
	}

	public static void display(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] arr) {
		for (int pass = 1; pass <= arr.length - 1; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}

			swap(arr, i, min_index);
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j, j - 1);
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int maxSubArraySum(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++){
					sum=sum+arr[k];
				}
				
				if(sum>max) {
					max=sum;
				}
			}
		}
		
		return max;
	}

}
