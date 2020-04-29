package Lecture12;

public class TOH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TOH(3,"src","dest","helper");

	}

	public static void TOH(int n, String src, String dest, String helper) {
		if (n == 0) {
			return;
		}
		TOH(n - 1, src, helper, dest);
		System.out.println("Move " + n + "th disk from " + src + " to " + dest);
		TOH(n - 1, helper, dest, src);
	}

}
