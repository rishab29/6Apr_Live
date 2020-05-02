package Lecture14;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60,70};
		System.out.println(binarySearch(arr, 25));

	}

	public static int binarySearch(int[] arr, int key) {

		int si = 0, ei = arr.length - 1;

		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}

		return -1;

	}

}
