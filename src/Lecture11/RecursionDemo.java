package Lecture11;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// printSS("abc", "");

		// printPermutations("abc", "");

		// printBoardPath(10, 0, "");

		// System.out.println(countBoardPath(10, 0, ""));

//		printMazePath(2, 2, 0, 0, "");
//		
//		System.out.println(countMazePath(2, 2, 0, 0, ""));
//		
	//	codesOfString("1234", "");
		
		printkeyPadCodes("111","");

	}

	public static void printSS(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, res);
		printSS(ros, res + cc);
	}

	public static void printPermutations(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutations(ros, res + cc);
		}
	}

	public static void printBoardPath(int end, int curr, String res) {
		if (curr == end) {
			System.out.println(res);
			return;
		}

		if (curr > end) {
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			printBoardPath(end, curr + dice, res + dice);
		}
	}

	public static int countBoardPath(int end, int curr, String res) {
		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int ans = 0;
		for (int dice = 1; dice <= 6; dice++) {
			ans = ans + countBoardPath(end, curr + dice, res + dice);
		}

		return ans;
	}

	public static void printMazePath(int er, int ec, int cr, int cc, String res) {
		if (cr == er && cc == ec) {
			System.out.println(res);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printMazePath(er, ec, cr, cc + 1, res + "H");
		printMazePath(er, ec, cr + 1, cc, res + "V");
	}

	public static int countMazePath(int er, int ec, int cr, int cc, String res) {
		if (cr == er && cc == ec) {
			// System.out.println(res);
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int ans = 0;
		ans = ans + countMazePath(er, ec, cr, cc + 1, res + "H");
		ans = ans + countMazePath(er, ec, cr + 1, cc, res + "V");
		return ans;
	}

	public static void codesOfString(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		String fs = str.substring(0, 1);
		String ros1 = str.substring(1);
		char code1 = getCode(fs);
		codesOfString(ros1, res + code1);

		if (str.length() >= 2) {
			String ds = str.substring(0, 2);
			String ros2 = str.substring(2);
			if (Integer.valueOf(ds) <= 26) {
				char code2 = getCode(ds);
				codesOfString(ros2, res + code2);
			}

		}
	}

	public static char getCode(String str) {
		int value = Integer.valueOf(str);
		int ascii = 96 + value;
		return (char) (ascii);
	}

	public static void printkeyPadCodes(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		String code = getcode(cc);
		for (int i = 0; i < code.length(); i++) {
			printkeyPadCodes(ros, res + code.charAt(i));
		}

	}

	public static String getcode(char cc) {
		if (cc == '1') {
            return "abc";
		}
		if (cc == '2') {
			return "def";
		}
		if (cc == '3') {
			return "ghi";
		}
		if (cc == '4') {
			return "jkl";
		}
		if (cc == '5') {
			return "mno";
		}
		if (cc == '6') {
			return "pqr";
		}
		if (cc == '7') {
			return "stu";
		}
		if (cc == '8') {
			return "vwx";
		}
		if (cc == '9') {
			return "yz";
		}
		
		return "";

	}

}
