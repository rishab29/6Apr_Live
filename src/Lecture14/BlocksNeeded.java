package Lecture14;

public class BlocksNeeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(blocksneeded(26));

	}

	public static int blocksneeded(int n) {
		int l = 0;
		int r = n;

		int ans = -1;
		while (l <= r) {
			int height = (l + r) / 2;
			int bn = (height * (height + 1)) / 2;

			if (bn > n) {
				r = height - 1;
			} else {
				ans = height;
				l = height + 1;
			}
		}

		return ans;
	}

}
