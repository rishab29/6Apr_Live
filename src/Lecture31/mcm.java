package Lecture31;

public class mcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60};
		System.out.println(mcm(arr,0,arr.length-1));

	}

	public static int mcm(int[] arr, int si, int ei) {
		if(ei-si==1) {
			return 0;
		}
		int myans = Integer.MAX_VALUE;

		int tot_cost = 0;
		int cost1 = 0;
		int cost2 = 0;
		int cost3 = 0;

		for (int i = si; i < ei - 1; i++) {
			cost1 = mcm(arr, si, i + 1);
			cost2 = mcm(arr, i + 1, ei);
			cost3 = arr[si] * arr[i + 1] * arr[ei];
			tot_cost = cost1 + cost2 + cost3;
			myans = Math.min(myans, tot_cost);
		}

		return myans;
	}

}
