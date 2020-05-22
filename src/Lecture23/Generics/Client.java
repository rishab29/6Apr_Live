package Lecture23.Generics;

public class Client {

	public static void main(String[] args) {
		Pair<Integer> pair2 = new Pair<>();
		//pair2.one = 1;
		//pair2.one = "SM"; //-- very cool
		pair2.two = 2;

		Integer one = pair2.one;
		System.out.println(one);
//
		Pair2d<Integer, String> pair3 = new Pair2d<>();

		pair3.one = 1;
		pair3.two = "SM";
		
		Pair2d<String, Integer> pair4 = new Pair2d<>();

		pair4.one = "SM";
		pair4.two = 3;
//
		Pair2d<Pair2d<Integer, String>, Pair2d<String, Integer>> deep = new Pair2d<>();

		deep.one = new Pair2d<>();
		deep.one.one = 1;
		deep.one.two = "SM";

		deep.two = new Pair2d<>();
		deep.two.one = "MS";
		deep.two.two = 2;

	}

}
