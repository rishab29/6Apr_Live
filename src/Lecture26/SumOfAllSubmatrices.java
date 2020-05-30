package Lecture26;

public class SumOfAllSubmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 1 }, { 1, 1 } };
		System.out.println(sum(arr));
	}

	public static int sum(int[][] arr) {
		int sum = 0;
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int tl = (i + 1) * (j + 1);
				int br = (n - i) * (n - j);
				sum = sum + tl * br * arr[i][j];
			}
		}

		return sum;
	}

}
