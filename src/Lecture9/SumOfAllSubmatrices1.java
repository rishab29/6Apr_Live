package Lecture9;

public class SumOfAllSubmatrices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 1 }, { 1, 1 } };
		
		System.out.println(submatrixsum(arr));
	}

	public static int submatrixsum(int[][] arr) {
		int m = arr.length;

		int sum = 0;

		for (int tli = 0; tli < m; tli++) {
			for (int tlj = 0; tlj < m; tlj++) {
				for (int bri = tli; bri < m; bri++) {
					for (int brj = tlj; brj < m; brj++) {

						for (int i = tli; i <= bri; i++) {
							for (int j = tlj; j <= brj; j++) {
								sum = sum + arr[i][j];
							}
						}
					}
				}
			}
		}

		return sum;
	}

}
