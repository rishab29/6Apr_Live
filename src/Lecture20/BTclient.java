package Lecture20;

public class BTclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 true 25 true 12 false false true 68 true 17 false false false true 75 true 39 false false true 49 false false
		BinaryTree tree=new BinaryTree();
		tree.display();
		
		System.out.println(tree.max());
		System.out.println(tree.min());
		
		System.out.println(tree.size());
		
		System.out.println(tree.height());
		
//		tree.display();
//		tree.mirror();
//		tree.display();
//		
		System.out.println();
		tree.pre();
		System.out.println();
		
		tree.in();
		System.out.println();
		tree.post();
		

	}

}
