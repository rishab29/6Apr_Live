package Lecture31;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);

		HashMap<Character, Integer> map = new HashMap<>();
		Queue<Character> q = new LinkedList<>();

		while (ch != '.') {
			q.add(ch);
			if (map.containsKey(ch)) {
				int ov = map.get(ch);
				ov = ov + 1;
				map.put(ch, ov);
			} else {
				map.put(ch, 1);
			}

			while (!q.isEmpty()) {
				char fc = q.peek();
				if (map.get(fc) == 1) {
					System.out.println(fc);
					break;
				} else {
					q.poll();
				}
			}

			if (q.isEmpty()) {
				System.out.println("-1");
			}

			ch = s.next().charAt(0);
		}

	}

}
