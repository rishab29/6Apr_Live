package Lecture20;

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

}
