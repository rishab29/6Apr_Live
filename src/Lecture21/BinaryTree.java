package Lecture21;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {

	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		this.root = this.takeInput(s, null, false);

	}

	private Node takeInput(Scanner s, Node parent, boolean lOrR) {
		// TODO Auto-generated method stub
		if (parent == null) {
			System.out.println("Enter the data for the root node");
		} else {
			if (lOrR) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);

			}
		}

		int data = s.nextInt();
		Node node = new Node(data, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child for " + node.data);
		choice = s.nextBoolean();

		if (choice) {
			node.left = this.takeInput(s, node, true);
		}

		choice = false;
		System.out.println("Do you have right child for " + node.data);
		choice = s.nextBoolean();

		if (choice) {
			node.right = this.takeInput(s, node, false);
		}

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}

		System.out.print(node.data);

		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}

		System.out.println();

		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int lmax = this.max(node.left);
		int rmax = this.max(node.right);
		int myans = Math.max(lmax, Math.max(rmax, node.data));
		return myans;
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		int lmin = this.min(node.left);
		int rmin = this.min(node.right);
		int myans = Math.min(lmin, Math.min(rmin, node.data));
		return myans;
	}

	public int size() {
		return this.size(this.root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}

		int lsize = this.size(node.left);
		int rsize = this.size(node.right);
		int myans = lsize + rsize + 1;
		return myans;
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}

		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		int myans = Math.max(lheight, rheight) + 1;
		return myans;
	}

	public boolean find(int data) {
		return this.find(this.root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}

		if (node.data == data) {
			return true;
		} else if (this.find(node.left, data)) {
			return true;
		} else if (this.find(node.right, data)) {
			return true;
		} else {
			return false;
		}
	}

	public void mirror() {
		this.mirror(this.root);
	}

	private void mirror(Node node) {
		if (node == null) {
			return;
		}

		Node temp = node.left;
		node.left = node.right;
		node.right = temp;

		this.mirror(node.left);
		this.mirror(node.right);
	}

	public void pre() {
		this.pre(this.root);
	}

	private void pre(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		this.pre(node.left);
		this.pre(node.right);
	}

	public void in() {
		this.in(this.root);
	}

	private void in(Node node) {
		if (node == null) {
			return;
		}

		this.in(node.left);
		System.out.print(node.data + " ");
		this.in(node.right);
	}

	public void post() {
		this.post(this.root);
	}

	private void post(Node node) {
		if (node == null) {
			return;
		}

		this.post(node.left);

		this.post(node.right);

		System.out.print(node.data + " ");
	}

	public void levelOrder() {
		LinkedList<Node> q = new LinkedList<>();
		q.add(this.root);

		while (!q.isEmpty()) {
			Node rv = q.removeFirst();
			System.out.print(rv.data + " ");

			if (rv.left != null) {
				q.add(rv.left);
			}

			if (rv.right != null) {
				q.add(rv.right);
			}
		}
	}

	public void rootToLeaf() {
		this.rootToLeaf(this.root, "");
	}

	private void rootToLeaf(Node node, String osf) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			osf = osf + node.data;
			System.out.println(osf);
			return;
		}

		rootToLeaf(node.left, osf + node.data + "=>");
		rootToLeaf(node.right, osf + node.data + "=>");

	}

	public int sumOfAllLeafNodes() {
		return this.sumOfALLLeafNodes(this.root);
	}

	private int sumOfALLLeafNodes(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return node.data;
		}

		int lsum = this.sumOfALLLeafNodes(node.left);
		int rsum = this.sumOfALLLeafNodes(node.right);

		int myans = lsum + rsum;
		return myans;
	}

	public int diameter() {
		return this.diameter(this.root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}

		int lheight = this.height(node.left);
		int rheight = this.height(node.right);

		int f1 = lheight + rheight + 2;
		int f2 = this.diameter(node.left);
		int f3 = this.diameter(node.right);

		int myans = Math.max(f1, Math.max(f2, f3));
		return myans;
	}

	public int DiaBtr() {
		return this.DiaBtr(this.root).diameter;
	}

	private Pair DiaBtr(Node node) {
		if (node == null) {
			Pair bp = new Pair(-1, 0);
			return bp;
		}

		Pair lp = DiaBtr(node.left);
		Pair rp = DiaBtr(node.right);

		Pair mp = new Pair();
		mp.height = Math.max(lp.height, rp.height) + 1;
		mp.diameter = Math.max(lp.height + rp.height + 2, Math.max(lp.diameter, rp.diameter));
		return mp;
	}

	class Pair {
		int diameter;
		int height;

		Pair() {

		}

		Pair(int height, int diameter) {
			this.height = height;
			this.diameter = diameter;
		}
	}

	class BalPair {
		int height;
		boolean isbal;
	}

	public boolean isbalanced() {
		return this.isbalanced(this.root).isbal;
	}

	private BalPair isbalanced(Node node) {
		if (node == null) {
			BalPair bp = new BalPair();
			bp.isbal = true;
			bp.height = -1;
			return bp;
		}

		BalPair lp = this.isbalanced(node.left);
		BalPair rp = this.isbalanced(node.right);

		BalPair mp = new BalPair();
		mp.height = Math.max(lp.height, rp.height) + 1;

		if (Math.abs(lp.height - rp.height) <= 1 && lp.isbal && rp.isbal) {
			mp.isbal = true;
		} else {
			mp.isbal = false;
		}

		return mp;

	}
	
	private int max_level=Integer.MIN_VALUE;
	public void rightView() {
		this.rightView(this.root,0);
	}
	
	private void rightView(Node node,int level) {
		if(node==null) {
			return;
		}
		if(level>max_level) {
			System.out.println(node.data);
			max_level=level;
		}
		
		rightView(node.right, level+1);
		rightView(node.left, level+1);
		
		
	}
	
	
	
	public void leftView() {
		max_level=Integer.MIN_VALUE;
		this.leftView(this.root,0);
	}
	
	private void leftView(Node node,int level) {
		if(node==null) {
			return;
		}
		if(level>max_level) {
			System.out.println(node.data);
			max_level=level;
		}
		
		leftView(node.left, level+1);
		leftView(node.right, level+1);
		
		
	}
}
